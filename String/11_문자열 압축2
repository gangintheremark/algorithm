import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        String result = "";
        Stack stack = new Stack();
        int count = 1; // 반복 횟수를 위한 변수

        for (char x : str.toCharArray()) {
            if (stack.empty()) { // stack이 비어있다면
                stack.push(x);
            } else { // 비어있지 않다면
                if (stack.peek().equals(x)) { // 반복된 수
                    count++;
                } else { // 새로운 수가 나왔다면
                    result += stack.pop(); // 알파벳 추가하고
                    stack.push(x);
                    if (count != 1) {
                        result += count; // 연속해서 나온 경우라면 횟수 추가
                    }
                    count = 1;
                }
            }
        }
        if (!stack.empty()) {
            result += stack.pop(); // 마지막 stack이 남아있다면
            if (count != 1)
                result += count;
        }
        System.out.println(result);
    }
}

