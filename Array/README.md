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

`피보나치 수열`

```java
answer[0] = 1;
answer[1] = 1;
for (int i = 2; i < n; i++)
    answer[i] = answer[i - 2] + answer[i - 1];
```

`소수`

```java
for (int i = 2; i < n; i++)
// 1은 소수가 아니므로 2부터 시작
// 배열값이 0이면 count++ 하고 그 위치의 배수들을 모두 1로 만들기
```

`숫자뒤집기`

```java
 answer = answer * 10 + arr[i] % 10; // 핵심!!
```

`등수구하기`
이중 for문 이용해서 배열 하나를 배열 모두와 비교하는 구조 </br>

`격자판 최대합`

```java
 for (int i = 0; i < arr.length; i++) {  // 대각선의 합
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length-i-1];  // 핵심
        }
```

`상하좌우 비교`
강의에서는
int[] dx = {1, 0, 1, 0} int[] dy = {0, 1, 0, -1} </br>
지정 후 i,j,k 3중 for문 으로 해결 </br></br>

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
