- [2583_영역구하기](https://www.acmicpc.net/problem/2583)
- [2667_단지번호 붙이기](https://www.acmicpc.net/problem/2667)
</br>

![2583_영역 구하기](https://github.com/gangintheremark/Algorithm/assets/81904943/86aa8502-37c5-4fd8-bd95-80c62bd00baf) 

 </br>

분리된 영역과 영역의 개수 출력 </br>

```java
public static void DFS(int x, int y) {
        board[x][y] = 1; // 다녀간 자리 체크
        count++; // 영역의 넓이

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (board[nx][ny] == 0)
                    DFS(nx, ny);
            }
        }
    }

ArrayList<Integer> areaCount = new ArrayList<>();
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) { 
                if (board[i][j] == 0) {
                    count = 0;
                    DFS(i, j); // 주변에 0인 곳들 넓이 탐색 후 다 1로 바꾸기
                    areaCount.add(count); // 배열에 추가
                }
            }
        }
```

- [1759_암호 만들기](https://www.acmicpc.net/problem/1759) </br>
알파벳 순으로 먼저 정렬해서 ch배열 필요없이 DFS가능 </br>
주의할점, 모음 문자 확인할 때 x.equals("a") 로 ~~x=="a"했다가 틀림~~</br>
```java
 public void DFS(int depth, int start) {
        if (depth == L) {
            if (isValid()) {
                for (String x : pwd)
                    System.out.print(x);
                System.out.println();
            }
        } else {
            for (int i = start; i < C; i++) {
                pwd[depth] = arr[i];
                DFS(depth + 1, i + 1);

            }
        }
    }
```

- [1987_알파벳](https://www.acmicpc.net/problem/1987)
한 번 나온 알파벳은 지나가면 안된다는 조건으로 char형 문자에 'A'를 빼줘 정수로 만들어서 해결하였다. ch배열로 풀어도되고 난 boolean 일차원 배열 선언해서 해결했다. 