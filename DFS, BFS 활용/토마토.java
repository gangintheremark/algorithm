import java.util.*;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 12시 - 3시 - 6시 - 9시 방향
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dist;
    static int m, n, answer = 0;
    static Queue<Point> Q = new LinkedList<>();

    public void BFS() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 방문
                    Q.offer(new Point(nx, ny));
                    dist[nx][ny] = dist[tmp.x][tmp.y] + 1; // 퍼져나가는 위치 (= 토마토가 익을동안의 날)
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        board = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = s.nextInt();
                if (board[i][j] == 1) Q.offer(new Point(i, j)); //익은토마토들은 바로 큐에 넣고 시작
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0)  // BFS가 끝났는데도 익지 않은 토마토가 있다면 false
                    flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dist[i][j]);
                }
            }
            System.out.println(answer);
        } else System.out.println(-1);
    }
}
