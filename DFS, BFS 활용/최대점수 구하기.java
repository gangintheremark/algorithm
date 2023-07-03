import java.util.*;

public class Main {
    static int[] t, score;
    static int answer = Integer.MIN_VALUE , n, m;
    public void DFS(int L, int sum, int time) {
        if ( time > m ) return;
        if (L == n) {
            answer = Math.max(answer, sum);

        } else {
            DFS(L + 1, sum + score[L], time + t[L]);
            DFS(L + 1, sum, time);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt(); // n문제
        m = s.nextInt(); // m분 안에 최대 점수 얻을 수 있도록
        t = new int[n];
        score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = s.nextInt();
            t[i] = s.nextInt();
        }
        T.DFS(0,0,0);
        System.out.println(answer);
    }
}
