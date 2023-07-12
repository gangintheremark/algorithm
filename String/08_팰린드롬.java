import java.util.*;

public class Main {
    public void solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        T.solution(str);
        return;
    }
}

