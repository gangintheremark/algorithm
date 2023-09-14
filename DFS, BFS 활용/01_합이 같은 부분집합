import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static String answer = "NO";
    static int[] arr;
    boolean flag = false;

    public void DFS(int L, int sum) {
        int total = Arrays.stream(arr).sum();
        if (flag) return;
        if (L == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }

        }
        else {
            DFS(L + 1, sum + arr[L]); // 부분집합에 포함
            DFS(L + 1, sum); // 부분집합에 포함 X 
        }
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        T.DFS(0,0);
        bw.write(answer + "\n");
        bw.close();
    }
}
