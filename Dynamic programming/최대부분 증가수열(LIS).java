import java.util.*;

public class Main {
    static int[] dy;
    public int solution(int[] arr) {
        int answer = 0;
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) { // i보다 앞쪽에 있는 것들 탐색
                if (arr[j] < arr[i] && dy[j] > max) // i값보다 작고 dy[j]값이 가장 큰 수
                    max = dy[j];
            }
            dy[i] = max +1;
            answer= Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
