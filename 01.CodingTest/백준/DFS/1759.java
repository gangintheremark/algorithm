import java.io.*;
import java.util.*;


public class Main {

    static int L, C;
    static String[] arr, pwd;

    public boolean isValid() {
        int a = 0;
        int b = 0;
        for(String x : pwd) {
            if (x.equals("a")|| x.equals("e")|| x.equals("i") || x.equals("o") ||x.equals("u"))
                a++;
            else b++;
        }
        if (a >= 1 && b >= 2) return true;

        return false;
    }

    public void DFS(int depth, int start) {
        if (depth == L) {
            if (isValid()) {
                for (String x : pwd)
                    System.out.print(x);
                System.out.println();
            }
        } else {
            for (int i = start; i < C; i++) {
                pwd[depth] = arr[i];
                DFS(depth + 1, i + 1);

            }
        }

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken()); // n
        C = Integer.parseInt(st.nextToken());
        arr = new String[C];
        pwd = new String[L];

        arr = br.readLine().split(" ");
        Arrays.sort(arr);
        T.DFS(0, 0);
        bw.close();
    }
}
