package ch01.String;

import java.util.*;
import java.lang.StringBuilder;

/* 문장뒤집기 ( 입력 후 한꺼번에 출력) */

public class Main {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp); // 리스트에 추가
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = s.next();
        }
        for (String x : T.solution(N, str))
            System.out.println(x);
    }
}
