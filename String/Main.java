package ch01.String;
import java.util.*;

public class Main {
    public  int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);  // char 대문자 만들기 

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t)   // string 한 문자씩 읽기 
                answer++;
        }
 
/* 
        for-each 사용해서 해결
       
        for(char x:str.toCharArray()) {
            if(x==t) answer++;
        }
 */  
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();
        char c = s.next().charAt(0);  // char 변수 입력받기

        System.out.println(T.solution(str, c)); // non-static 으로 선언된 solution
    }
}
