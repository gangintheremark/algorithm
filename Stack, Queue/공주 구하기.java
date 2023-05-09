import java.util.*;

public class Main {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= n; i++) Q.offer(i);  // q값 넣기

        while (!Q.isEmpty()) {
            for (int i = 1; i < k ; i++)  Q.offer(Q.poll());  // k값 만큼 뒤로 보내기

            Q.poll(); // k번째는 poll 
            if (Q.size() == 1)  // 마지막 남았는게 정답
                answer = Q.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println(T.solution(n,k));
    }
}