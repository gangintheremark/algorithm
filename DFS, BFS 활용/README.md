#### DFS 
 
 I. 경우의 수가 포함한다 포함하지않는다 2개로 나뉜 이진트리 </br>
 
 🍓`바둑이 승차`🍓
 ```java
 public void DFS(int L, int sum) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(sum, answer);
        } else {
            DFS(L + 1, sum + arr[L]); // 포함한다.
            DFS(L + 1, sum); // 포함하지 않는다.
        }
    }
 ```

🍓`최대점수 구하기`🍓
```java
/*10분문제 5점
  25분문제 12점
   ...
 관련있는 두 수를 N번 입력받을 경우, 그냥 일차원 배열 두 개 만들어서 하기 넘므 어렵게 생각X */
else {
        DFS(L + 1, sum + score[L], time + t[L]);
        DFS(L + 1, sum, time);
}
    
```

🍓`합이 같은 부분집합`🍓
```java
  if (total - sum == sum) { 
   /* 전체합에서 뽑힌 수들의 sum을 빼면 나머지 수들의 합 -> 요런거 생각해내는거 중요 */ 
  }
```


II. 여러가지로 뻗어나가는 구조의 트리 </br>
일차원 배열 pm 으로 for문 돌며 값 저장하며 DFS</br>

🍓`중복순열 구하기`🍓
```java
  else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
```

🍓`중복없는 순열 구하기`🍓</br>
일차원 배열 ch 선언 후 사용하면 1로 백트래킹하며 다시 0으로 
```java
else {
    for (int i = 0; i < n; i++) {
        if (ch[i] == 0) { //사용하지 않았을 때
            pm[L] = arr[i];
            ch[i] = 1; // 사용함 표시
            DFS(L + 1);
            ch[i] = 0; // Back하면서 다시 0으로 
        }
    }
}
```

🍓`동전교환`🍓</br>
Collections.reverseOrder() 배열 내림차순하는 메소드 사용 시 배열은 Integer로 선언</br>
```java
Integer arr = new Integer[n]; 
Arrays.sort(arr, Collections.reverseOrder());
/*시간을 줄이기 위해 큰 수 부터 확인해서 답 찾기! (내림차순) 
굳이 필요없는 과정이긴 한데 런타임에러뜨면 이런식으로 시간 줄이기*/
```