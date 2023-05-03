import java.util.*;

public class Main {
    public boolean isPrime(int num) { // 소수인지 아닌지 체크
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public void solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = 0;
            while (true) {
                answer = answer * 10 + arr[i] % 10; // 핵심
                if (arr[i] / 10 == 0)
                    break;
                arr[i] /= 10;
            }
            if (isPrime(answer))
                System.out.print(answer + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        T.solution(arr);
    }
}
