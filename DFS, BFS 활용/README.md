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
```java
Q. 삼각형 가장 위에 들어갈 n개의 숫자찾기 
삼각형에서 가장 위에 들어갈 숫자와 n-1 조합을 곱한 값의 합이 f 
3 1 2 4
 4 3 6
  7 9
   16
``` 
-> 3 x <sub>3</sub>C<sub>0</sub> + 1 x <sub>3</sub>C<sub>1</sub> + 2 x <sub>3</sub>C<sub>2</sub> + 3 x <sub>3</sub>C<sub>3</sub> = 16

</br>

🍓`조합 구하기`🍓</br>
1부터 N까지의 번호가 적힌 OO이 있다. 이 중 M개를 뽑는 방법의 수 👉 조합문제 유형 암기 ⭐⭐
```java
static int[] combi;
    public void DFS(int L, int s) {
        if(L==m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = s; i <= n ; i++) { // i는 s부터
                combi[L] = i;
                DFS(L+1, i+1); // i에서 1증가하는걸로 다음층으로 넘어간다
            }
        }
    }
```
----
</br>

### **`격자판 문제`**

🍒`미로탐색`🍒

```java
static int[] dx = {-1, 0, 1, 0}; // 상하좌우
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


🍒`토마토`🍒
```java
// 미로탐색 같은 문제에서 출발점이 중간중간에 존재할때, 입력받으면서 해당 지점 큐에 미리 넣어두기 
for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = s.nextInt();
                if (board[i][j] == 1) Q.offer(new Point(i, j)); //익은토마토들은 바로 큐에 넣고 시작
            }
        }
// ...
public void BFS() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 방문
                    Q.offer(new Point(nx, ny));
                    dist[nx][ny] = dist[tmp.x][tmp.y] + 1; // 퍼져나가는 위치 (= 토마토가 익을동안의 날)
                }
            }
        }
    }
```

🍒`섬나라`🍒
```java
public void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) { // 섬 발견
                    answer++;
                    board[i][j] = 0; // 출발점을 0으로 하고 뻗어나가기
                    BFS(i, j); // 주변에 있는 섬(1)들 0으로 바꾸기 위한 BFS
                }
            }
        }
    }
```
🍒`피자배달거리`🍒 </br>
###### 입력예시는 0,1,2 포함된 이차원 배열로 주어졌지만 빈 곳, 집, 피자집 나뉘고 거리재는 문제다 보니 이차원배열보다 ArrayList 만들어서 1나오면 집리스트에 add, 2나오면 피자집리스트에 add 하는 형식으로 풀었다. (0은 그냥 무시하는 느낌) 
###### 여러 개 중에 m개의 피자집 선택 -> 조합문제 유형 if 에는 m개의 피자집을 뽑았을 때 실행되야하는 코드 + else에는 조합 국룰코드 쓰기(+combi 배열!!)
```java
 for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = s.nextInt();
                if(tmp == 1) hs.add(new Point(i,j));  // 1이면 house 리스트에
                else if (tmp == 2) pz.add(new Point(i,j)); // 2이면 pizza 리스트에
            }
        }

 public void DFS(int L, int s) {
        if (L==m) {
            int sum = 0;
            for(Point h : hs) {
                int dist = Integer.MAX_VALUE;
                for(int i : combi) {
                    dist = Math.min(dist, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                    // 각각의 집과 살아남은 피자집의 거리
                }
                sum += dist; // sum : 각 집마다의 배달거리를 합한 도시의 피자배달거리
            }
            answer = Math.min(answer, sum);
        }
        else {
            /* 조합 -> m개의 살아남은 피자집 */
            for (int i = s; i < len ; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
```