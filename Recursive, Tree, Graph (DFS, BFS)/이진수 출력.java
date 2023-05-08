import java.util.*;

public class Main {
    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        T.DFS(n);
    }
}

