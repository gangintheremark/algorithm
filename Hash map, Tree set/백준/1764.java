import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        n = Integer.parseInt(st.nextToken()); // 듣도 못한사람
        m = Integer.parseInt(st.nextToken()); // 보도 못한사람

        for (int i = 0; i < n; i++) {  // 듣도 못한사람 리스트
            map.put(br.readLine(), 0);
        }
        int count = 0;
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if (map.containsKey(tmp)) { // 명단에 있으면 듣보잡
                count++;
                name.add(tmp);
            }
        }
        Collections.sort(name); // ArrayList 정렬
        bw.write(count + "\n");
        for(String x : name) bw.write(x + "\n");
        bw.close();
    }
}
