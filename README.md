🔥🔥🔥🔥🔥🔥🔥🔥🔥

----

</br>
백준 풀 때, 주의할 점 </br>
Scanner은 입력받는데 오래걸림 입력값 범위가 큰 수들은 Scanner 사용❌</br>
</br>
input: </br>
5</br>
1 2 3 4 5</br>

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

![image](https://github.com/gangintheremark/Algorithm/assets/81904943/ab368fcc-9328-44f8-bef6-e2399603ba90)
