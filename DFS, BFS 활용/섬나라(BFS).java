import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; //상하좌우, 대각선
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static int n, answer = 0;
    static Queue<Point> Q = new LinkedList<>();

    public void BFS(int x, int y) {
        Q.offer(new Point(x, y));
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) { // 섬 발견
                    answer++;
                    board[i][j] = 0; // 출발점을 0으로 하고 뻗어나가기
                    BFS(i, j); // 주변에 있는 섬(1)들 0으로 바꾸기
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = s.nextInt();
            }
        }
        T.solution();
        System.out.println(answer);
    }
}
