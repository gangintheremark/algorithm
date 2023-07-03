import java.util.*;

public class Main {
    int answer = 0;
    int[] dis = {-1, 1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;  // 방문하면 1 
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];  // nx : x의 자식노드
                    if (nx == e) return L+1;  // 경로를 찾으면 return
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {  // 방문 안한 것인지
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner str = new Scanner(System.in);
        int s = str.nextInt();
        int e = str.nextInt();
        System.out.println(T.BFS(s, e));
    }
}