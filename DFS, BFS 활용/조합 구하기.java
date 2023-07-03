import java.util.*;

public class Main {
    static int n, m;
    static int[] combi;
    public void DFS(int L, int s) {
        if(L==m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = s; i <= n ; i++) { // i는 s부터
                combi[L] = i;
                DFS(L+1, i+1); // i에서 1증가하는걸로 다음층으로 넘어간다
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();
        combi = new int[m];
        T.DFS(0, 0);
    }
}
