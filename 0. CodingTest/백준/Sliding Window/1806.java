import java.io.*;
import java.util.*;

public class Main {
    static int n, s;
    public int solution(int[] arr) {
        int answer = Integer.MAX_VALUE, sum = 0;
        int lt = 0, rt = 0;

        while (lt < n && rt < n) {
            sum += arr[rt];

            while (sum >= s) {
                answer = Math.min(answer, rt - lt + 1);
                sum -= arr[lt];
                lt++;
            }
            rt++;
        }
        if (answer == Integer.MAX_VALUE) return 0;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(arr));
    }
}
