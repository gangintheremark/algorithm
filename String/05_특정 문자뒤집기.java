import java.util.*;

public class Main {
    public String solution(String str) {
        char[] c = str.toCharArray();
        int lt = 0, rt = c.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }

        }
        String answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();

        System.out.println(T.solution(str));
    }
}