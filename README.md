🔥🔥🔥🔥🔥🔥🔥🔥🔥
</br>
백준 풀 때, 주의할 점 </br>
Scanner은 입력받는데 시간 오래걸림 (입력값 범위가 큰 수들은 Scanner 사용x)</br>
</br>
input: </br>
5</br>
-2 4 -99 -1 98</br>

```java
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); 
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());  
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken()); 
    }
}

```