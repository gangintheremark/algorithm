`깊이우선탐색(DFS, Depth-First Search)` </br>
- 모든 노드를 방문하고자 하는 경우
- [부분집합 구하기]
</br>

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
- 두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶은 경우
</br>

- [이진트리 레벨탐색](https://github.com/gangintheremark/Algorithm/blob/master/DFS%2C%20BFS/%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%20%EB%A0%88%EB%B2%A8%ED%83%90%EC%83%89.java)

- [송아지찾기](https://github.com/gangintheremark/Algorithm/blob/master/DFS%2C%20BFS/%EC%86%A1%EC%95%84%EC%A7%80%20%EC%B0%BE%EA%B8%B0.java)

🐌`송아지찾기`🐌
```java
// 최단 경로 찾기
int[] dis = {-1, 1, 5}; // 뻗어나갈 수 있는 경우
```