import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pz, hs;

    public void DFS(int L, int s) {
        if (L==m) {
            int sum = 0;
            for(Point h : hs) {
                int dist = Integer.MAX_VALUE;
                for(int i : combi) {
                    dist = Math.min(dist, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                    // 각각의 집과 살아남은 피자집의 거리
                }
                sum += dist; // sum : 각 집마다의 배달거리를 합한 도시의 피자배달거리
            }
            answer = Math.min(answer, sum);
        }
        else {
            /* 조합 -> m개의 살아남은 피자집 */
            for (int i = s; i < len ; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt(); // 여러 개의 피자집 중 m개 선택
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = s.nextInt();
                if(tmp == 1) hs.add(new Point(i,j));  // 1이면 house 리스트에
                else if (tmp == 2) pz.add(new Point(i,j)); // 2이면 pizza 리스트에
            }
        }
        len = pz.size(); // 도시에 있는 피자집의 갯수. len에서 m개 선택해야함
        combi = new int[m];
        T.DFS(0,0);
        System.out.println(answer);
    }
}
