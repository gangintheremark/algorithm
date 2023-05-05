import java.lang.management.ThreadInfo;
import java.util.*;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순의 treeset

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int l = j + 1; l < n; l++)   // n개 중 3장 랜덤 뽑기
                    Tset.add(arr[i]  + arr[j] + arr[l]); // 3장의 합
        int count =0;
        for(int x : Tset) {
            count++;
            if(count == k) return x;
            // System.out.println(x); -> 3장의 합이 나올수 있는 경우 모두가 내림차순 정렬하여 나옴
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(T.solution(n, k, arr));
    }
}