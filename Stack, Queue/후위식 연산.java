import java.util.*;

public class Main {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);  // 문자로 입력된 숫자들을 아스키코드의 숫자로 변환
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String str = s.next();
        System.out.println(T.solution(str));
    }

}