import java.util.*;


public class Main {
    // 두 배열 합치기 [효율적으로]
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2])
                answer.add(a[p1++]);
            else
                answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        for (int x : T.solution(n, m, a, b))
            System.out.print(x + " ");
    }
}