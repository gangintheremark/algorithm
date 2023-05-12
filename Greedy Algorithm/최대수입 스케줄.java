import java.util.*;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time;
    }
}

public class Main {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder()); // 큰 값을 우선순위로 뽑고싶다
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) { // 가장 여유로운 날짜부터 하루씩 줄어들면서
            for (; j < n; j++) {
                if (arr.get(j).time < i) break;
                PQ.offer(arr.get(j).money);
            }
            if (!PQ.isEmpty()) answer += PQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = s.nextInt();
            int t = s.nextInt();
            arr.add(new Lecture(m, t));
            if (t > max) max = t; // 날짜 중에 가장 큰 값 저장
        }
        System.out.println(T.solution(arr));
    }
}
