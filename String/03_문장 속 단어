import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] tmp = str.split(" ");
        int max = Integer.MIN_VALUE;

        for (String x : tmp) {
            int len = x.length();
            if (len > max) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        System.out.println(T.solution(str));
    }
}