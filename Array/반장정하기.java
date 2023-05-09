package test;

import java.util.*;

public class 반장정하기 {
    public int solution(int[][] arr, int n) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) { // i번 학생의 k학년과 j번 학생의 k학년은 같은 반이였는가?
                        count++; // 같으면 count 올려주고 종료
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= 5; j++)
                arr[i][j] = s.nextInt();

        System.out.println(T.solution(arr, n));
    }
}
