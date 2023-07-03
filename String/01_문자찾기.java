import java.util.*;

public class Main {
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (c == x)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();
        char c = s.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}