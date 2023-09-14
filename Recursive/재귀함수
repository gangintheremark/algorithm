import java.util.*;

public class Main {
    /*
    스택프레임 개념
    자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력

    DFS(n-1);
    System.out.print(n + " ");
    // -> 1 2 3 출력
    System.out.print(n + " ");
    DFS(n-1);
    // -> 3 2 1 출력

    스택프레임으로 생각
    */
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        T.DFS(n);
    }
}

