`깊이우선탐색(DFS, Depth-First Search)` </br>
- 모든 노드를 방문하고자 하는 경우

`메모이제이션`</br>
컴퓨터 프로그램이 동일한 계산을 반복해야 할 때, 이전에 계산한 값을 메모리에 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술

🙉`재귀함수`🙉</br>
###### 스택프레임으로 생각하고 해결
```java
    DFS(n-1);
    System.out.print(n + " ");
    // 👉 1 2 3 출력

    System.out.print(n + " ");
    DFS(n-1);
    // 👉 3 2 1 출력
```

🙉`정수 n에 대해서 0~n까지의 합`🙉
```java
public int DFS(int n) {
    if ( n == 0 ) return 0;
    else
        return n + DFS(n-1);
}
```

🙉`팩토리얼`🙉
```java
public int DFS(int n) {
    if ( n == 0 ) return 0;
    else
        return n + DFS(n-1);
}
```

🙉`피보나치(메모이제이션)`🙉 </br>
코딩 인터뷰에서 자주 질문⭐️⭐️⭐️
```java
static int[] fibo;  // 피보나치 수열 값을 저장할 배열 선언
public int DFS(int n) {
    if(fibo[n] > 0 ) return fibo[n];  // 메모이제이션 ⭐️
    if (n < 2) return fibo[n] = 1;
    else
        return fibo[n] = DFS(n - 1) + DFS(n - 2);
}
/* 👆 n이 2 이상일때, 3이상이면 n==1 return 1; n==2 return 1; */
```



