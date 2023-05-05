import java.util.*;

public class Main {
      /* 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 가짓수 */
    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1; // 핵심! ex) 합이 15가 되려는 자연수 중 7+8 -> 8(n/2+1)이 최대
        int[] arr = new int[m];
        for (int i = 0; i < m; i++)
            arr[i] = i + 1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if (sum == n)  // sum 이 n 이랑 일치
                answer++;

            while (sum >= n) { // sum 이 n보다 크거나 같을때까지 lt값 빼주기
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(T.solution(n));
    }
}