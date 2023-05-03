import java.util.*;

public class Main {
    // 에라토스테네스 체
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1]; // 인덱스가 n까지 생겨야 하니깐
        for (int i = 2; i < n; i++) { // 1은 소수가 아니다.
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(T.solution(n));
    }
}
