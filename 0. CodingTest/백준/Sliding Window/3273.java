import java.util.*;

public class Main {
    static int n, x;

    public int solution(int[] a) {
        int lt = 0, rt = n - 1, answer = 0;
        Arrays.sort(a);  // 정렬 후 시작(lt)과 끝(rt) 두개를 더하면서 시작

        while (lt < rt) {
            int sum = a[lt] + a[rt];

            if (sum == x) {
                answer++;
                rt--;
                lt++;
            }
            else if (sum > x) rt--;
            else lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        x = s.nextInt();

        System.out.println(T.solution(a));
    }
}
