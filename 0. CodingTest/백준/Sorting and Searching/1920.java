import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0, rt = n - 1;
        Arrays.sort(a);

        for (int i = 0; i < m; i++) {
            lt = 0;
            rt = n - 1;
            while (lt <= rt) {
                int mid = (lt + rt) / 2;

                if (a[mid] == b[i]) {
                    answer.add(1);
                    break;
                } 
                else if (a[mid] > b[i]) rt = mid - 1;
                else lt = mid + 1;
            }
            if (lt > rt)
                answer.add(0);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        for( int x : T.solution(a, b))
            bw.write(x + "\n");
        bw.close();
    }
}
