package test;

import java.util.*;

public class Main {
    public int solution(int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2; // 행의 합, 열의 합
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < arr.length; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < arr.length; i++) {  // 대각선의 합
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length-i-1];  // 핵심
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
}

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(T.solution(arr));

    }
}
