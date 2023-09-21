import java.util.*;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int cv = Q.poll(); // v와 이어져있는 리스트
            for(int x : graph.get(cv)) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    Q.offer(x);
                    dis[x] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();
        graph = new ArrayList<ArrayList<Integer>>(); // graph 객체 생성
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<Integer>()); // 객체 생성
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            graph.get(a).add(b); // a번이 갈 수 있는 리스트에 b추가
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
