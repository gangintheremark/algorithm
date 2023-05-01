package ch01.String;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE; // 가장 작은 수
        /* split 사용해서 문장 자르기 */
        String[] s = str.split(" ");
        for (String x : s) { // for-each문 사용
            int len = x.length();
            if (max < len) {
                max = len;
                answer = s[i];
            }
        }
        // ********** indexOf(), substring() 사용 **********
        //
        // while ((pos = str.indexOf(" ")) != -1) { // 공백 위치 찾기
        // String tmp = str.substring(0, pos); // 공백 전까지 자르기
        // int len = tmp.length();
        // if (len > max) { // >= 하면 뒤 쪽 같은길이의 단어가 답이 되어버림
        // max = len;
        // answer = tmp;
        // }
        // str = str.substring(pos+1);
        // }
        // f (str.length() > max) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.nextLine(); // 한 줄 입력받기
        System.out.println(T.solution(str));
    }
}
