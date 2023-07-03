import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 12시 - 3시 - 6시 - 9시 방향
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            for (int i = 0; i < 4; i++) {  // 4방향
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) { //내가 갈 수 있는 길
                    board[nx][ny] = 1; // 지나간 길은 체크
                    DFS(nx, ny);
                    board[nx][ny] = 0; //백트래킹
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        board = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = s.nextInt();
            }
        }
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
