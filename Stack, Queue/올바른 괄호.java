import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if (x == '(')
                stack.push(x);
            else {  // ')' 이면 스택에서 '(' 제거
                if (stack.isEmpty()) // 비어있으면 NO
                    return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty())   // stack이 비어있지 않으면 NO
            return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();

        System.out.println(T.solution(str));
    }
}