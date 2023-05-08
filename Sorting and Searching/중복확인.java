import java.util.*;

public class Main {
    public char solution(int n, int[] arr) {
        char answer = 'U';

        Arrays.sort(arr);  // 배열 정렬 후 
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) return 'D';
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        ;
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(T.solution(n, arr));
    }
}

/* char answer = 'U';

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return 'D';
            }
        }
        return answer;
*/