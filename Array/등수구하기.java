package test;

import java.util.*;

public class Main {
    public void solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = 1;
            for (int j = 0; j < arr.length; j++) { // 이중 for문 이용해서 배열 하나를 배열 모두와 비교하는 구조
                if (i != j && arr[i] < arr[j])
                    answer++;
            }
            System.out.print(answer + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        T.solution(arr);
    }
}
