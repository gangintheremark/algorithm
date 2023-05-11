import java.util.*;

public class Main {
    static int n, m;
    static int[] pm;

    public void DFS(int L) {
        if (L == m) {
            for(int x : pm)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
