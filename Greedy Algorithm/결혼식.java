import java.util.*;

class Time implements Comparable<Time> {
    public int time;
    public char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state; // 'e'상태가 먼저 나오도록
        return this.time - o.time; //시간 기준 오름차순 정렬
    }
}

public class Main {
    public int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int count = 0; // 동시에 존재하는 인원
        for (Time o : arr) {
            if (o.state == 's') count++;
            else count--;
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = s.nextInt();
            int eT = s.nextInt();
            arr.add(new Time(sT, 's')); // 출발시간 저장
            arr.add(new Time(eT, 'e')); // 나간시간 저장
        }
        System.out.println(T.solution(arr));
    }
}
