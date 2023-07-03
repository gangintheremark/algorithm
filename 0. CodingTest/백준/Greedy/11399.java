import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    public int solution(int[] arr) {
        int answer = 0, sum = 0;

        Arrays.sort(arr);

        for(int x : arr) {
            sum += x;
            answer += sum;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(T.solution(arr) + "\n");
        bw.close();
    }
}
