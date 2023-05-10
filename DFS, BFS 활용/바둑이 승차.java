import java.util.*;

public class Main {
    static int n, c, answer, tmp = 0;
    static int[] arr;

    public void DFS(int L, int sum) {
        if (L == n) {
            if (c >= sum) {
                answer = Math.max(sum, tmp);
                tmp = answer;
            }
        } else {
            DFS(L + 1, sum + arr[L]); // 태운다
            DFS(L + 1, sum); //안태운다
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        c = s.nextInt(); // 수용가능한 최대무게
        n = s.nextInt(); // 바둑이 수
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        T.DFS(0,0);
        System.out.println(answer);
    }
}
