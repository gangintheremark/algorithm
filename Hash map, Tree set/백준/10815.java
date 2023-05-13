import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public void solution(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for(int x : a)
            map.put(x, map.getOrDefault(x, 0)+1);

        for(int x : b) {
            if (map.containsKey(x))
                System.out.print(1 +" ");
            else
                System.out.print(0 + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        m = Integer.parseInt(br.readLine());
        int[] b = new int [m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        T.solution(a,b);
    }
}
