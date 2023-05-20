import java.util.*;

public class Solution {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int count =0;
            for(int testcase = 1; testcase <= 10; testcase++) {
                int N = s.nextInt(); // 건물의 개수
                int[][] board = new int[255][N];
                count = 0;

                // 각 건물의 높이
                for (int i = 0; i < N; i++) {
                    int tmp = s.nextInt();
                    for (int j = 255 - tmp; j < 255; j++) {
                        board[j][i] = 1;
                    }
                }

                for (int i = 0; i < 255; i++) {
                    for (int j = 2; j < N - 2; ) {
                        if (board[i][j] == 1 && board[i][j - 1] == 0 && board[i][j - 2] == 0 && board[i][j + 1] == 0 && board[i][j + 2] == 0) {
                            count++;
                            j += 2;
                            continue;
                        }
                        j++;
                    }
                }
                System.out.printf("#%d %d\n", testcase, count);
            }
        }

}
