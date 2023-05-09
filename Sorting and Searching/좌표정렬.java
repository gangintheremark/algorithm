import java.util.*;

class Point implements Comparable<Point> { // 정렬하는 기준을 잡아주는 Comparable
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) // x값이 같으면
            return this.y - o.y;  // y좌표 기준 정렬 (오름차순 : y - o)
        else
            return this.x - o.x;  // x값이 다르면 x좌표 기준 정렬
    }
}
public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr); // 정렬기준에 의해서 정렬
        for (Point o : arr) System.out.println(o.x + " " + o.y);
    }
}

