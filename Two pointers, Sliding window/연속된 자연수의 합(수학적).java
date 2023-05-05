import java.util.*;

public class Main {
    /* 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 가짓수 */
    public int solution(int n) { // n=15
        int answer = 0, count =1; // count : 연속된 자연수의 개수
        n--;  // n=14
        while  (n>0) {
            count++; // count =2
            n = n - count; // n=12
/* N에서 1, 2를 뺸 값을 count로 나눈 나머지가 0이면 해당 연속된 자연수의 합으로 N을 만들 수 있다는 의미 */
            if (n % count == 0)
                answer++;
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