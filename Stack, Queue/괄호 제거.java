import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ; // pop()은 꺼낸 값을 return
            }
            else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++)
            answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();
        System.out.println(T.solution(str));
    }
}