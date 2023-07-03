
import java.util.*;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] arr;

    public void DFS(int L, int sum) {
        if (sum > m) return;
        if (sum == m)
            answer = Math.min(answer, L);
        else {
            for (int i = 0; i < n; i++)
                DFS(L+1, sum+arr[i]);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt(); // 동전의 종류 개수
        arr = new Integer[n];  // 동전의 종류
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        //시간을 줄이기 위해 큰 수 부터 확인해서 답 찾기! (내림차순)
        m = s.nextInt(); // 거슬러 줄 금액
        T.DFS(0,0);
        System.out.println(answer);
    }
}
