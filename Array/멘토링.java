import java.util.*;

public class Main {

    public int solution(int[][] arr, int N, int M) {
        int answer = 0, count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) ; //(i,j)멘토멘티, 동일인물 제외
                for (int k = 0; k < M; k++) { // M번의 테스트에서 짝이 될 수 있는지
                    for (int l = 0; l < N; l++) {
                        if (arr[k][l] == j+1) {
                            count = -1;
                            break;
                        }
                        if (arr[k][l] == i+1) {
                            count++; // 3개가 되면 answer ++
                            break;
                        }
                    }
                    if(count == -1) break;
                }
                if (count == M) answer++; // M개의 테스트에서 멘토가 모두 앞선다
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                arr[i][j] = s.nextInt();

        System.out.println(T.solution(arr, N, M));
    }
}