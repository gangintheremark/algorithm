package test;

import java.util.*;

public class Main {
    public int solution(int[][] arr, int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i][j - 1]) {
                    answer++;
                    j++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                arr[i][j] = s.nextInt();
        }

        System.out.println(T.solution(arr, n));
    }
}
