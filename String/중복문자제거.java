package ch01.String;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";

        // ksekkset
        // i str.indexOf(str.charAt(i))
        // k 0 0
        // s 1 1
        // e 2 2
        // k 3 0
        // k 4 0
        // s 5 1
        // e 6 2
        // t 7 7
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) // indexOf('문자')는 처음 찾은 위치 고정
                answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(T.solution(str));
    }
}
