import java.util.*;

class Edge implements Comparable<Edge> {
    public int vex;
    public int cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;  // 비용 오름차순 정렬
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n + 1]; // 집합에 포함된지 안된지 체크
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            graph.get(a).add(new Edge(b, c)); // 무방향 그래프 이므로
            graph.get(b).add(new Edge(a, c));
        }
        int answer = 0;
        PriorityQueue<Edge> PQ = new PriorityQueue<>();
        PQ.offer(new Edge(1, 0));
        while (!PQ.isEmpty()) {
            Edge tmp = PQ.poll(); // PQ에서 cost가 가장 작은값 poll
            int now = tmp.vex;  // 현재정점
            if (ch[now] == 0) {
                ch[now] = 1; //포함
                answer += tmp.cost; // cost 더하기
                for (Edge o : graph.get(now)) { //정점에서 연결된 다른 정점들 PQ에 offer
                    if (ch[o.vex] == 0)
                        PQ.offer(new Edge(o.vex, o.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
