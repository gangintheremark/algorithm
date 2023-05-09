package test;

import java.util.*;

public class Main {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { // 틀렸을 때,
                count = 1;
            } else { // 맞췄을 때,
                arr[i] = count++;
            }
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
