import java.util.*;

public class Main {
    /*
    9  3 (9가지의 노래를 3개의 DVD에 넣을 때 DVD의 최소용량)
    1 2 3 4 5 6 7 8 9  (분)

    최소한 9분(젤 긴 노래)은 넣을 수 있어야한다. (최소 : 9) lt
    최대한 노래 전부는 넣을 수 있어야한다. (최대 : 45) rt
    -> 답은 9 ~ 45 이내에 확실하게 있다. (결정 알고리즘)

    mid = (9 + 45) / 2 = 27   (lt + rt)/2
    DVD 하나의 용량이 27이면 답으로써 가능한 숫자이다. (DVD 생성 수를 count하는 함수 생성)
    최소용량을 찾아야 하므로 왼쪽부분에서 찾기 rt = mid - 1
    mid = (9 + 26) / 2 =  17
    DVD 하나의 용량이 17이면 답으로써 가능한 숫자이다.
    mid = (9 + 16) / 2 = 12
    DVD 하나의 용량이 12이면 답으로써 불가능하다.
    다시 오른쪽 부분에서 찾기  lt = mid + 1
    */
    public int count(int[] arr, int capacity) { // 용량(capacity)으로 DVD 몇 장을 담을 수 있는가
        int cnt = 1; // DVD장 수
        int sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) { //용량 넘어가면 DVD 한장 추가
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();  // 배열에서 최대를 int형으로 return
        int rt = Arrays.stream(arr).sum(); // 배열에서 모든 값을 합한 값
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            // mid값이 답으로 가능한가
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(T.solution(n, m, arr));
    }
}

