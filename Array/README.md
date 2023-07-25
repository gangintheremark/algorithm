```java
 // 소수인지 아닌지 체크
  public boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
```

`피보나치 수열` <br>
0과 1로 시작하며, 뒤이어 오는 숫자가 앞의 두 숫자의 합으로 이루어지는 수열

```java
answer[0] = 1;
answer[1] = 1;
for (int i = 2; i < n; i++)
    answer[i] = answer[i - 2] + answer[i - 1];
```

`소수` <br>
[에라토스테네스 체](https://gangintheremark.tistory.com/93) 


`숫자뒤집기` <br>
StringBuilder 로 정수를 문자열 타입으로 바꿔 넣고 reverse <br>
reverse 한 StringBuilder 수를 다시 문자열로 변환하고 정수형 변환 <br>
( 910 👉 19 )

```java
for (int x : arr) {
    StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
    if (isPrime(Integer.valueOf(sb.toString()))) { 
    ...

```

`상하좌우 비교` <br>
격자판에서 상하좌우 문제 팁 <br>

```java
int[] dx = {1, 0, 1, 0};
int[] dy = {0, 1, 0, -1};
// 지정 후 i,j,k 3중 for문 으로 해결 

 for (int i = 1; i <= n; i++) 
            for (int j = 1; j <= n; j++) 
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

```

