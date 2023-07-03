import java.util.*;

public class Main {
    static int[] dy;
    public int solution(int n) {
        dy[1] =1; // 1번계단 까지 올라가는 방법 1가지
        dy[2] =2; // 2번계단 까지 올라가는 방법 2가지
        for (int i = 3; i <=n ; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        dy = new int[n+1];
        System.out.println(T.solution(n));
    }
}
