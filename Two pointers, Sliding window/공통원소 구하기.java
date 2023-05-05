import java.util.*;


public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a); // 오름차순 정렬
        Arrays.sort(b);

        while (p1<n && p2<m) {
            if (a[p1] == b[p2]) {   // 같으면 추가
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2])
                p1++;
            else
                p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];  //중복되어 주어지지 않는다.
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