import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (map.containsKey(name)) map.remove(name);
            else map.put(name, state);
        }
        ArrayList<String> arr = new ArrayList<String>(map.keySet());
        Collections.sort(arr, Collections.reverseOrder());
        for(String x : arr)
            System.out.println(x);
    }
}
