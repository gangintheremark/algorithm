import java.util.*;

/* Sliding Window */
public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer =0, sum = 0;
        for (int i = 0; i < k; i++) {  // 처음 윈도우 생성
            sum += arr[i];
            answer = sum;
        }
        for (int i = k ; i < n; i++) {
            sum += (arr[i] - arr[i-k]);  // 윈도우 값 변경
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println(T.solution(n,k,arr));
    }
}