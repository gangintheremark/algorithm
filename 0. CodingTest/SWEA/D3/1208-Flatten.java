import java.util.*;

public class Solution {
    static int[][] board;
    static int N, answer, max, min;
    static boolean flag1 = true, flag2 = true;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int testcase = 1; testcase <= 10; testcase++) {
            N = s.nextInt(); // 덤프 횟수
            int[] arr = new int[100];
            board = new int[100][100];
            for (int i = 0; i < 100; i++) {
                arr[i] = s.nextInt();
            }
            max = Arrays.stream(arr).max().getAsInt();
            min = Arrays.stream(arr).min().getAsInt();
            for (int i = 0; i < N; i++) {
                flag1 = true;
                flag2 = true;
                for (int j = 0; j < 100; j++) {
                    if (flag1 && arr[j] == max) {
                        arr[j]--;
                        flag1 = false;
                    }
                    if (flag2 && arr[j] == min) {
                        arr[j]++;
                        flag2 = false;
                    }
                }
                max = Arrays.stream(arr).max().getAsInt();
                min = Arrays.stream(arr).min().getAsInt();
                answer = max - min;
            }
            System.out.printf("#%d %d\n", testcase, answer);
        }
    }
}