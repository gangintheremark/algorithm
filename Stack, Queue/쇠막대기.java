import java.util.*;

public class Main {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            if (str.charAt(i) == ')') {
                stack.pop();
                if (str.charAt(i - 1) == '(')  //레이저
                    answer += stack.size();
                else answer++;  //통나무 하나가 끝나므로 통나무 하나 더 +
            }
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