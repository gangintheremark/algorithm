import java.util.*;

public class Main {
    /*
    5  3  (5개의 마구간에 3마리 배치)
    1 2 8 4 9  (마구간의 좌표)
    구하고자 하는 것 : 두 말 사이의 최대 거리
    최소 lt = 1
    최대 rt = arr[n-1]  (너무 세세하게 생각X)  9라고 생각
    -> 답은 lt ~ rt 사이에 확실하게 있다. (결정알고리즘)
    mid = (1+9)/2 = 5
    가장 가까운 두말의 거리를 5로했을 때 답이 가능한지 (말의 배치 수를 count하는 함수 생성)
    두 마리의 말만 배치할 수 있으므로 mid보다 더 작은 값이 되어야함
    rt = mid - 1
    ...

    */
    public int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0]; // 말은 시작점에 첫 배치
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {//우리가 정한 최대거리(mid)보다 크거나 같으면
                cnt++; // 말 한마리 놓고
                ep = arr[i]; // 말 위치로
            }
        }
        return cnt;
    }
    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr); // 정렬
        int lt = 1;
        int rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {  // C마리 보다 많이 놓을 수 있다면
                answer = mid;
                lt = mid + 1; //mid 보다 최대가 되는 값이 있는가 다시 확인
            } else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int c = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)  //마구간 좌표
            arr[i] = s.nextInt();

        System.out.println(T.solution(n, c, arr));
    }
}

