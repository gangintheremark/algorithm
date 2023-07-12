import java.util.*;

public class Main {
    public void solution(String str) {
        str = str.toLowerCase(); // 소문자로 바꾸기
        
        // 투 포인터 이용
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) {
                System.out.println(("NO"));
                return;
            }
            lt++;
            rt--;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();

        T.solution(str);
        return;
    }
}

/*
 * // StringBuilder 사용
 * public void solution(String str) {
 * String tmp = new StringBuilder(str).reverse().toString();
 * if(str.equalsIgnoreCase(tmp)) //대소문자 무시하고 비교
 * System.out.println("YES");
 * else
 * System.out.println("NO");
 * }
 * 
 */
