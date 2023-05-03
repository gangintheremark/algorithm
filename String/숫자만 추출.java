package ch01.String;

import java.util.*;

public class Main {
    public int solution(String str) {
        int answer = 0;

        for (char x : str.toCharArray())
            if (x >= 48 && x <= 57) // 숫자면
                answer = answer * 10 + (x - 48); // 아스키 코드

        /*
         * Characther.isDigit(c) // 함수 이용
         * for(char x : str.toCharArray())
         * if(Character.isDigit(x)) // 숫자냐?
         * answer += x;
         * 
         */

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(T.solution(str));
    }
}
