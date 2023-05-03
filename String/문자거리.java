package ch01.String;

import java.util.*;

public class Main {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for (int i = str.length()-1; i >=0 ; i--) {
            if (str.charAt(i) == t)
                p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); // 더 작은 값 넣기
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();
        char t = s.next().charAt(0);

        for(int x : T.solution(str, t))
            System.out.print(x + " ");
    }
}

