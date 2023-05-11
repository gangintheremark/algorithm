import java.util.*;

public class Main {
    static int n, f;
    int[][] dy = new int[35][35];
    static int[] b, pm, ch;
    boolean flag = false;

    public int combi(int n, int r) {  // 조합 수 구하는 함수
        if (dy[n][r] > 0) return dy[n][r]; // 메모이제이션
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : pm) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = i;
                    DFS(L + 1, sum + (pm[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        f = s.nextInt();
        b = new int[n];  // 조합의 수를 넣기위한
        pm = new int[n];
        ch = new int[n];
        // 삼각형에서 가장 위에 들어갈 숫자와 n-1 조합을 곱한 값의 합이 f
        /*    3 1 2 4
               4 3 6
                7 9
                 16
         3 x 3C0 + 1 x 3C1 + 2 x 3C2 + 3 x 3C3 = 16
         */
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }
        T.DFS(0, 0);
    }
}
