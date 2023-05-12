import java.util.*;

class Edge implements Comparable<Edge> {
    public int vex; //정점
    public int cost; // 간선의 가중치 값

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return o.cost - o.cost;  // 비용 기준 오름차순
    }
}

public class Main {
    static int n, m;
    static int[] dist;  // 정점 i로 가는데 최소 거리비용
    static ArrayList<ArrayList<Edge>> graph; //리스트 안에 Edge객체 리스트

    public void solution(int v) {
        PriorityQueue<Edge> PQ = new PriorityQueue<>(); // 작은 수 부터 나옴
        PQ.offer(new Edge(v, 0)); // 1번째 정점은 cost 0
        dist[v] = 0;
        while (!PQ.isEmpty()) {
            Edge tmp = PQ.poll(); // 가장 작은 cost 가 poll
            int now = tmp.vex; // 현재 정점
            int nowCost = tmp.cost; // 현재 비용
            if (nowCost > dist[now]) continue; //현재 비용이 저장된비용보다 크면 무시
            for (Edge o : graph.get(now)) { // 크지않으면 1번 정점과 연결된 Edge객체 for-each문
                if (dist[o.vex] > nowCost + o.cost) { // 1번에서 2번으로 가는 최소비용이 저장된 최소비용보다 작으면
                    dist[o.vex] = nowCost + o.cost; // 다시 갱신
                    PQ.offer(new Edge(o.vex, nowCost + o.cost)); // PQ 리스트에 offer 
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();
        graph = new ArrayList<ArrayList<Edge>>(); // 정점, 간선, 가중치를 저장하기 위한 인접리스트 생성
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE); // dist배열 모두 MAX_VALUE값으로
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        T.solution(1); // 1번 정점부터 시작
        for (int i = 2; i <= n; i++) {
            if (dist[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dist[i]);
            else System.out.println(i + " : impossible");
        }
    }
}
