package ch01.String;

import java.util.*;
import java.lang.StringBuilder;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x))
                answer += Character.toLowerCase(x);
            else
                answer += Character.toUpperCase(x);
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

/*
 * 아스키코드로 풀기
 * for (char x : str.toCharArray()) {
 * if (x >= 97 && x <= 122) answer += (char) (x - 32);
 * 
 * else
 * answer += (char) (x + 32);
 * }
 */