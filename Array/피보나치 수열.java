import java.util.*;

public class Main {
    // 피보나치 수열
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int x : T.solution(n))
            System.out.print(x + " ");
    }
}

/*
 * 배열 안쓰고 피보나치 수열
 * int a=1, b=1, c;
 * System.out.prin(a + " " + b + " ");
 * for(int i=2; i<n; i++) {
 * c = a + b;
 * System.out.print(c + " ");
 * a = b;
 * b = c;
 * }
 */
