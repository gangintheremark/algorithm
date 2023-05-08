import java.util.*;

public class Main {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n] > 0 ) return fibo[n];  // 메모이제이션
        if (n < 2) return fibo[n] = 1;
        else
            return fibo[n] = DFS(n - 1) + DFS(n - 2);
    }
    /* n이 2 이상일때, 3이상이면 n==1 return 1; n==2 return 1; */

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++)
            System.out.print(fibo[i] + " ");
    }
}

   /* for (int i = 1; i <= n ; i++) {
            System.out.print(T.DFS(i) + " ");
      너무 오래 걸림  --> 메모이제이션 활용
   */

