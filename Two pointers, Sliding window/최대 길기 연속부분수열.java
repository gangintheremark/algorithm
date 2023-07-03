import java.util.*;

public class Main {
    static int n, k;

    public int solution(int[] a) {
        int answer = 0, lt = 0, count = 0;

        for (int rt = 0; rt < n; rt++) {

            if (a[rt] == 0) {
                count++;
                while (count > k) {
                    if (a[lt] == 0) count--;
                    lt++;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        k = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        System.out.println(T.solution(a));
    }
}
