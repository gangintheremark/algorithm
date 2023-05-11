import java.util.*;

class Body implements Comparable<Body> {
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h - this.h;  // 키 기준 내림차순 정렬
    }

}
public class Main {
    public int solution(ArrayList<Body> arr, int n) {
        int count = 0;
        Collections.sort(arr); // 정렬기준에 의해서 정렬
        int max = Integer.MIN_VALUE;
        for (Body o : arr) {
            if (o.w > max) {
                max = o.w;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = s.nextInt();
            int w = s.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
