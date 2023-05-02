package ch01.String;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] c = str.toCharArray();

        int lt = 0; // 첫번째문자
        int rt = str.length() - 1; // 마지막 문자

        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt]))
                lt++;
            else if (!Character.isAlphabetic(c[rt]))
                rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }

        String result = String.valueOf(c);
        System.out.println(result);
    }
}
