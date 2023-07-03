import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 도감에 수록된 포켓몬 수
        m = Integer.parseInt(st.nextToken()); // 맞춰야 하는 문제 수

        HashMap<String, Integer> map = new LinkedHashMap<>(); // 포켓몬 도감

        for (int i = 0; i < n; i++) // 도감생성
            map.put(br.readLine(), i + 1);

        Object[] keyArr = map.keySet().toArray();

        for (int i = 0; i < m; i++) {
            String test = br.readLine(); // 문제 입력받기

            if (Character.isDigit(test.charAt(0))) { // 문제가 숫자라면
                System.out.println(keyArr[Integer.parseInt(test) -1]);
            }
            else
                System.out.println(map.get(test));
        }
    }
}
