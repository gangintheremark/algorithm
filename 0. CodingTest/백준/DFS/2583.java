import java.io.*;
import java.util.*;


public class Main {

    static int n, m, k, count = 0;
    static int[][] board;
    static int[] dx = {1, 0, -1, 0}; // 상하좌우
    static int[] dy = {0, 1, 0, -1};

    public static void DFS(int x, int y) {
        board[x][y] = 1; // 다녀간 자리 체크
        count++; // 영역의 넓이

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (board[nx][ny] == 0)
                    DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //세로 5
        m = Integer.parseInt(st.nextToken()); //가로 7
        k = Integer.parseInt(st.nextToken()); // 사각형
        board = new int[n][m];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // 0
            int y1 = Integer.parseInt(st.nextToken()); // 2
            int x2 = Integer.parseInt(st.nextToken()); // 4
            int y2 = Integer.parseInt(st.nextToken()); // 4

            for (int y = y1; y < y2; y++) {
                for(int x = x1; x< x2; x++) {
                    board[y][x] = 1;  //point(x,y)좌표로 주어진건 배열에선 자리바꿔서
                }
            }
        }
        ArrayList<Integer> areaCount = new ArrayList<>();
        for (int i = 0; i < n; i++) { // 5번반복
            for (int j = 0; j < m; j++) { // 7번반복
                if (board[i][j] == 0) {
                    count = 0;
                    DFS(i, j); // 주변에 0인 곳들 넓이 탐색 후 다 1로 바꾸기
                    areaCount.add(count); // 배열에 추가
                }
            }
        }
        Collections.sort(areaCount);
        bw.write(areaCount.size() + "\n");
        for (int x : areaCount)
            bw.write(x + " ");

        bw.close();
    }
}
