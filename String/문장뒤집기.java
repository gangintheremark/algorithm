package ch01.String;

import java.util.*;
import java.lang.StringBuilder;

/* 문자뒤집기 ( 입력 시 바로 출력 ) */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder(s.next()); // StringBuilder

            System.out.println(sb.reverse()); // reverse()
        }
    }
}
