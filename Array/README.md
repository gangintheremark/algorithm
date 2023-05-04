🐷`피보나치 수열`🐷
```java
answer[0] = 1;
answer[1] = 1;
for (int i = 2; i < n; i++) 
    answer[i] = answer[i - 2] + answer[i - 1];   
```

🐷`소수`🐷
```java
for (int i = 2; i < n; i++) 
// 1은 소수가 아니므로 2부터 시작
// 배열값이 0이면 count++ 하고 그 위치의 배수들을 모두 1로 만들기
```

🐷`숫자뒤집기`🐷
```java
 answer = answer * 10 + arr[i] % 10; // 핵심!!

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

