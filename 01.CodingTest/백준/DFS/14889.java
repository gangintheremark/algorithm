import java.io.*;
import java.util.*;

public class Main {

    static int n, m, answer = 0;
    static int[][] board;

    static int[] team;

    public void DFS(int L, int s) {
        if (L== n/2){
            for (int i = 0; i < n/2; i++) {
                // 팀 능력치 차이가 최소인지 확인.
            }
        }
        else {
            for (int i = s; i <= n; i++) {
                team[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        T.DFS(0,0);
        bw.write(answer + "\n");
        bw.close();
    }
}
