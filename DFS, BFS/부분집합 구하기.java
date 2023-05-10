import java.util.*;

public class Main {
    static int n; // 원소의 개수
    static int[] ch; // 체크 배열 (부분집합으로 사용한다 안한다)

    public void DFS(int L) { // L층 으로 생각
        if (L == n + 1) { // 종착점에 왔을 경우,
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) // 사용했다면
                    tmp += (i + " ");
            }
            if (tmp.length() > 0)
                System.out.println(tmp);
        } else {
            ch[L] = 1; // 사용한다
            DFS(L + 1); // 사용한다로 뻗는 함수
            ch[L] = 0; // 사용하지 않는다.
            DFS(L + 1); // 사용하지 않는다로 뻗는 함수
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3; // 1부터 n까지의 원소를 갖는 집합의 부분집합 (공집합 제외)
        ch = new int[n + 1];
        T.DFS(1);
    }
}