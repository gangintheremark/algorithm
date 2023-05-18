import java.io.*;
import java.util.*;


public class Main {

    static int n, count = 0;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0}; // 상하좌우
    static int[] dy = {0, 1, 0, -1};

    public static void DFS(int x, int y) {
        board[x][y] = 0; // 다녀간 자리 체크
        count++; // 영역의 개수

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (board[nx][ny] == 1)
                    DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Scanner s = new Scanner(System.in);

        n = Integer.parseInt(br.readLine()); // nxn
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }


        ArrayList<Integer> areaCount = new ArrayList<>();
        for (int i = 0; i < n; i++) { // 5번반복
            for (int j = 0; j < n; j++) { // 7번반복
                if (board[i][j] == 1) {
                    count = 0;
                    DFS(i, j); // 주변에 1인 곳들 넓이 탐색 후 다 0로 바꾸기
                    areaCount.add(count); // 배열에 추가
                }
            }
        }
        Collections.sort(areaCount);
        bw.write(areaCount.size() + "\n");
        for (int x : areaCount)
            bw.write(x + "\n");

        bw.close();
    }
}
