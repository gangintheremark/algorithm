import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());  // 한 줄 입력받고
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken()); // int배열에 하나씩 저장

        int lt = 0, rt = n - 1, max = 2000000000;
        int x = -1, y = -1;
        Arrays.sort(a);

        while (lt < rt) {
            int sum = a[lt] + a[rt];
            if (max > Math.abs(sum)){
                max = Math.abs(sum);
                x = a[lt];
                y = a[rt];
            }
            if (sum > 0) rt--;
            else lt++;
        }

        System.out.println(x +" " + y);
    }
}
