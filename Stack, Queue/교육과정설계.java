import java.util.*;

public class Main {
    public String solution(String n, String k) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : n.toCharArray())  Q.offer(x);  // 큐에 CBA 넣기  
        for(char x : k.toCharArray()) { 
                if (Q.contains(x)) {  // 필수과목에 포함되었는데
                    if(x != Q.poll()) return "NO";  // 이수 순서가 다르면 NO
            }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String a = s.next();  // CBA
        String b = s.next();  // CBDAGE
        System.out.println(T.solution(a, b));
    }
}