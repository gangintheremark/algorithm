🔥🔥🔥🔥🔥🔥🔥🔥🔥

---

</br>

Scanner, System.out.print 는 오래걸림 입력값 범위가 큰 수들은 사용❌</br>

```java
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            bw.write(arr[i] + " ");
        }
    }
}

```
