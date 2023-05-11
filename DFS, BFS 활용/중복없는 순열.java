import java.util.*;

public class Main {
    static int n, m;
    static int[] arr, ch, pm;
    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) { //사용하지 않았을 때
                    pm[L] = arr[i];
                    ch[i] = 1; // 사용함 표시
                    DFS(L + 1);
                    ch[i] = 0; // Back하면서 다시 0으로 
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt(); // m개를 뽑아 일렬로 나열
        ch = new int[n];
        arr = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        T.DFS(0);
    }
}
