import java.util.*;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, count = 0; // count : 0을 1로 바꾼 횟수
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                count++;
                while (count > k) {
                    if (arr[lt] == 0) count--; // lt가 0을 만나면 rt가 만나면서 1로 바꿨던 것을 다시 바꾼다는 느낌으로
                    lt++;
                }
            }
            answer = Math.max(answer, lt - rt + 1);

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

        System.out.println(T.solution(n, k, arr));
    }
}