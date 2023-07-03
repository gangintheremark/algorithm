import java.util.*;

class Brick implements Comparable<Brick> {
    public int s,h,w;
    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
        /* 넓이를 내림차순으로 두어 첫번째 벽돌부터 살펴볼때, 무게가 앞 벽돌보다 무거운지만 체크하면 됨*/
    }
}

public class Main {
    static int[] dy;
    public int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];  // answer 초기화 !!
        for (int i = 1; i < arr.size() ; i++) {
            int max_h = 0;
            for (int j = i-1; j >= 0 ; j--) { // i보다 앞의 벽돌 탐색
                if (arr.get(j).w > arr.get(i).w && dy[j]>max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            arr.add(new Brick(a,b,c));
        }
        System.out.println(T.solution(arr));
    }
}
