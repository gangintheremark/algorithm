### `DFS` 
 
 **I. 경우의 수가 "포함한다" "포함하지않는다" 2개로 나뉜 이진트리** </br>
 
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

</br>

**II. 여러가지로 뻗어나가는 구조의 트리** </br>
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

</br>

**III. 조합 활용**

🍓`수열 추측하기`🍓</br>
Q. 삼각형 가장 위에 들어갈 n개의 숫자찾기
삼각형에서 가장 위에 들어갈 숫자와 n-1 조합을 곱한 값의 합이 f
3 1 2 4
 4 3 6
  7 9
   16
-> 3 x <sub>3</sub>C<sub>0</sub> + 1 x <sub>3</sub>C<sub>1</sub> + 2 x <sub>3</sub>C<sub>2</sub> + 3 x <sub>3</sub>C<sub>3</sub> = 16

🍓`조합 구하기`🍓</br>
1부터 N까지의 번호가 적힌 OO이 있다. 이 중 M개를 뽑는 방법의 수 👉 조합문제 유형
```java
else {
            for (int i = s; i <= n ; i++) { // i는 s부터
                combi[L] = i;
                DFS(L+1, i+1); // i에서 1증가하는걸로 다음층으로 넘어간다
            }
        }
```

</br>

🍓`미로탐색`🍓

```java
static int[] dx = {-1, 0, 1, 0}; // 12시 - 3시 - 6시 - 9시 방향
static int[] dy = {0, 1, 0, -1};
// ...
 else {
            for (int i = 0; i < 4; i++) {  // 4방향
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) { //내가 갈 수 있는 길
                    board[nx][ny] = 1; // 지나간 길은 체크
                    DFS(nx, ny);
                    board[nx][ny] = 0; //백트래킹
                }
            }
        }
```

</br>

### `BFS`

🍒`미로의 최단거리 `🍒
```java
 public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = 1; //출발지는 1
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 방문
                    Q.offer(new Point(nx, ny));
                    dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
```