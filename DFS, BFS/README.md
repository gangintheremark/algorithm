`깊이우선탐색(DFS, Depth-First Search)` </br>
- 모든 노드를 방문하고자 하는 경우

`이진트리순회`</br>

![binary tree](https://user-images.githubusercontent.com/28912774/120569404-ce26a900-c450-11eb-8be6-c72bae145569.png) </br>
 
  - 전위순회 : 1 - 2 - 4 - 5 - 3 - 6 - 7
  - 중위순회 : 4 - 2 - 5 - 1 - 6 - 3 - 7
  - 후위순회 : 4 - 5 - 2 - 6 - 7 - 3 - 1

```java
/* 전위순회 */
 public void DFS(Node root) {
    if (root == null) return;
    else {
        System.out.print( root.data + " ");
        DFS(root.lt); //왼쪽 가지
        DFS(root.rt); //오른쪽 가지
    }
}

/* 중위순회 */
 public void DFS(Node root) {
    if (root == null) return;
    else {
        DFS(root.lt); //왼쪽 가지
        System.out.print( root.data + " ");
        DFS(root.rt); //오른쪽 가지
    }
}

/* 후위순회 */
 public void DFS(Node root) {
    if (root == null) return;
    else {
        DFS(root.lt); //왼쪽 가지
        DFS(root.rt); //오른쪽 가지
        System.out.print( root.data + " ");
    }
}
```
----

`넓이우선탐색(BFS, Breadth-First Search)` </br>
- 두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶은 경우 </br>

`그래프`
```java
//  무방향 그래프
graph[a][b] = 1;
graph[b][a] = 1;

// 방향 그래프
graph[a][b] = 1;

// 가중치 방향 그래프
graph[a][b] = c;

```

----

#### DFS

🐌`부분집합 구하기`🐌
```java
 if (L == n + 1) { // 종착점에 왔을 경우,
    String tmp = "";
    for (int i = 1; i <= n; i++) {
    if (ch[i] == 1) // 사용했다면
        tmp += (i + " ");
    }
    if (tmp.length() > 0)
        System.out.println(tmp);
} 
else {
    ch[L] = 1; // 사용한다
    DFS(L + 1); // 사용한다로 뻗는 함수
    ch[L] = 0; // 사용하지 않는다.
    DFS(L + 1); // 사용하지 않는다로 뻗는 함수
}
```
![image](https://github.com/gangintheremark/Algorithm/assets/81904943/af653bc5-a7a0-4855-94fe-7cfd73bf8dd3)

🐌`경로탐색`🐌
```java
for (int i = 1; i <= n; i++) {
    if (graph[v][i] == 1 && ch[i] == 0) { 
    // v노드에서 갈 수 있는 방향인가 && 한번도 방문하지 않은 노드인가
        ch[i] = 1; // 방문표시
        DFS(i);  // recursion
        ch[i] = 0; // Back 하면서 체크 풀어주기
    }
}
```

🐌`경로탐색(인접리스트)`🐌
```java
static ArrayList<ArrayList<Integer>> graph; //arraylist 속 arraylist
 graph = new ArrayList<ArrayList<Integer>>(); // graph 객체 생성
    for (int i = 0; i <= n; i++) {
        graph.add(new ArrayList<Integer>()); // 객체 생성
    }
// ...
 for (int nv : graph.get(v)) { // v번이 갈 수 있는 리스트
                if (ch[nv] == 0) { // 방문안했으면
                    ch[nv] = 1; // 방문 표시
                    DFS(nv); // recursion
                    ch[nv] = 0; // Back 하면서 체크 풀어주기
                }
            }
```
----


#### BFS
🐌`이진트리 레벨탐색`🐌
```java
Queue<Node> Q = new LinkedList<>();
Q.offer(root);
int L = 0;
while (!Q.isEmpty()) {
    int len = Q.size(); 
    for (int i = 0; i < len; i++) { // 큐 길이만큼 반복
        Node cur = Q.poll(); // Q 가져오기
        System.out.print(cur.data + " ");
        if (cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식이 있으면 offer
        if (cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식이 있으면 offer
    }
    L++; // Level 1증가
}
```

🐌`송아지찾기`🐌
```java
int[] dis = {-1, 1, 5}; // 뻗어나갈 수 있는 경우
// ...
ch[s] = 1;  // 방문하면 1 
Q.offer(s);
int L = 0;
while (!Q.isEmpty()) {
    int len = Q.size();
    for (int i = 0; i < len; i++) {
        int x = Q.poll();
        for (int j = 0; j < 3; j++) {
            int nx = x + dis[j];  // nx : x의 자식노드
            if (nx == e) return L;  // 경로를 찾으면 return
            if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {  // 방문 안한 것인지
                ch[nx] = 1; // 방문
                Q.offer(nx); 
            }
        }
    }
    L++; // Level 1증가
}
```

🐌`말단노드까지 가장 가까운 거리`🐌
```java
 Queue<Node> Q = new LinkedList<>();
Q.offer(root);
int L = 0; // 다음 층수로 간 횟수? 거리??같은 느낌
while (!Q.isEmpty()) {
    int len = Q.size();
    for (int i = 0; i < len; i++) {
        Node x = Q.poll();
        if (x.lt == null && x.rt == null) return L; // 말단노드면 L리턴
        if (x.lt != null) Q.offer(x.lt);
        if (x.rt != null) Q.offer(x.rt);
    }
    L++;
}
```

![image](https://github.com/gangintheremark/Algorithm/assets/81904943/76a1cd06-8eec-4846-8c2d-8a7d92bf2bc5)


🐌`그래프 최단거리`🐌
```java
 Queue<Node> Q = new LinkedList<>();
Q.offer(root);
int L = 0; // 다음 층수로 간 횟수? 거리??같은 느낌
while (!Q.isEmpty()) {
    int len = Q.size();
    for (int i = 0; i < len; i++) {
        Node x = Q.poll();
        if (x.lt == null && x.rt == null) return L; // 말단노드면 L리턴
        if (x.lt != null) Q.offer(x.lt);
        if (x.rt != null) Q.offer(x.rt);
    }
    L++;
}
```
