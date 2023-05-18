import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        long[] arr;
        for(int i = 1;i<=T;i++) {
            long n = s.nextInt();
            arr = new long[(int) n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            long max = 0, money = 0;
            for(int j = arr.length-1; j >= 0; j--) {
                if(max < arr[j]) {
                    max = arr[j];
                    continue;
                }
                money += max - arr[j];
            }
            System.out.printf("#%d %d\n", i, money);
        }
    }
}
