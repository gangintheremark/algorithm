🐷`피보나치 수열`🐷
```java
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) 
            answer[i] = answer[i - 2] + answer[i - 1];   
```