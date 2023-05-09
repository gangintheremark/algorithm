import java.util.*;

public class Main {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray())
            map.put(x, map.getOrDefault(x, 0) + 1);
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) //x 라는 키가 존재하지 않거나 x 키의 값이 0이면
                return "NO";
            map.put(x, map.get(x) - 1);  // 값이 존재하면 -1 해준다.
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String s1 = s.next();
        String s2 = s.next();

        System.out.println(T.solution(s1, s2));
    }
}