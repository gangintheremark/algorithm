import java.io.*;
import java.util.*;

public class Main {

    static int n, m, answer = 0;
    static int[][] board;
    static boolean[] alpha = new boolean[26]; //지나간 알파벳인지 확인

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void DFS(int x, int y, int count) {
        alpha[board[x][y]] = true;
        answer = Math.max(answer, count);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m ) {
                if (alpha[board[nx][ny]] == false) {
                    DFS(nx, ny, count + 1);
                    alpha[board[nx][ny]] = false; // 지나온 알파벳
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j) - 'A';
            }
        }

        T.DFS(0, 0, 1);
        bw.write(answer + "\n");
        bw.close();
    }
}
