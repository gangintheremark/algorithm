import java.util.*;

class Edge implements Comparable<Edge> {
    public int v1;
    public int v2;
    public int cost;

    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;  // 비용 오름차순 정렬
    }
}

public class Main {
    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        unf = new int[n + 1];
        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            unf[i] = i;
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            arr.add(new Edge(a, b, c));
        }
        int answer = 0;
        int count = 0;
        Collections.sort(arr);
        for (Edge o : arr) {
            int fv1 = Find(o.v1);
            int fv2 = Find(o.v2);
            if (fv1 != fv2) { // 원래 같은 집합이면 무시
                answer += o.cost;
                count++;
                Union(o.v1, o.v2); //한 집합으로 묶기
            }
            if (count == n - 1) break; //만약 시간초과 뜨면
        }
        System.out.println(answer);
    }
}
