import java.util.*;

class Person {
    int id;  // 대기순서
    int d;   // 위험도

    public Person(int id, int d) {
        this.id = id;
        this.d = d;
    }
}
public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.add(new Person(i, arr[i]));  // add() 메소드
        }
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();

            for(Person x : Q) {
                if (x.d > tmp.d) { // 본인보다 더 위험도가 높은 환자가 있다면
                    Q.add(tmp); // add()메소드
                    tmp = null;
                    break;
                }
            }
            if (tmp!=null) {
                if (tmp.id == m) return answer;
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}