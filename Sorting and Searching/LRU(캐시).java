import java.util.*;

public class Main {
    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (arr[i] == x) pos = i;
                if (pos == -1) {  // 캐시에 없을 떄, 0제외 땡기기
                    for (int j = size - 1; j > 0; j--) {
                        cache[j] = cache[j - 1];
                    }
                } else {  // 캐시에 있을 때, 0제외 해당지점(pos)까지 땡기기
                    for (int j = pos; j > 0; j--) {
                        cache[j] = cache[j - 1];
                    }
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        for (int x : T.solution(size, n, arr))
            System.out.print(x + " ");
    }
}