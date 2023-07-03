import java.util.*;

class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e =e;
    }
    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s - o.s; // 끝나는 시간이 같으면 시작시간 오름차순
        else return this.e - o.e; // 끝나는 시간 오름차순 정렬
    }
}

public class Main {
    public int solution(ArrayList<Time> arr, int n) {
        int count = 0;
        Collections.sort(arr); // 기준에 의해서 정렬
        int et = 0;
        for (Time o : arr) {
            if (o.s >= et) { // 끝나는 시간이 출발시간보다 같거나 작으면
                count++;
                et = o.e; // end time은 해당 객체의 끝나는 시간으로
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr, n));
    }
}
