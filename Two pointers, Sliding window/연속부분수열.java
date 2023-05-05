import java.util.*;

/* two pointers & sliding window */
public class Main {
    /* N개의 수열에서 연속부분수열의 합이 M이 되는 경우가 몇 번인지 */
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt =0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while(sum >= m) {   // sum이 m보다 작을때 까지 lt값 뺴주기
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}