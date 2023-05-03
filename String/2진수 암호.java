package ch01.String;

import java.util.*;

public class Main {
    public void solution(String str, int n) {
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0'); // 0부터 7까지
            int num = Integer.valueOf(tmp, 2); // 2진수 -> 10진수
            System.out.print((char) num);
            str = str.substring(7); // index 기준 7번째부터 시작 (이전내용 삭제)
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next(); // 문자의 개수의 일곱배

        T.solution(str, n);
    }
}
