`깊이우선탐색(DFS, Depth-First Search)` </br>
- 모든 노드를 방문하고자 하는 경우

![이진트리](https://user-images.githubusercontent.com/28912774/120569404-ce26a900-c450-11eb-8be6-c72bae145569.png)
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