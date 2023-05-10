import java.util.*;

public class Main {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n)
            answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) { // v노드에서 갈 수 있는 방향인가 && 한번도 방문하지 않은 노드인가
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 백하면서 체크 풀어주기
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            graph[a][b] = 1; // 방향 그래프
        }
        ch[1] = 1; // 1번노드 check (출발점이니깐)
        T.DFS(1);
        System.out.println(answer);
    }
}
