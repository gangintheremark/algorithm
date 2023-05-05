import java.util.*;

public class Main {
    public char  solution(int n, String str) {
        char answer= ' ';
        HashMap<Character, Integer> map = new HashMap<>(); // Hashmap<key, value> 설정
        for ( char x: str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
           // System.out.println(x + " " + map.get(key));
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String str = s.next();

        System.out.println(T.solution(n, str));
    }
}