import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static String answer = "NO";
    boolean flag = false;

    public void DFS(int L, int sum) {
        int total = Arrays.stream(arr).sum(); 
        if (flag) return;
        if (L == n) {
            if (total - sum == sum) {  
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L]);  // 부분집합에 포함
            DFS(L + 1, sum); // 부분집합에 포함X
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
