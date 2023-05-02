package ch01.String;

import java.util.*;
import java.lang.StringBuilder;

/* 문장뒤집기 ( 입력 후 한꺼번에 출력) */

public class Main {

    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c); // char형 배열을 다시 String으로
            answer.add(tmp);
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
        for (String x : T.solution(str))
            System.out.println(x);
    }
}