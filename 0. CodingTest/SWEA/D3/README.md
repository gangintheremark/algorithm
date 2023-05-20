- [`1244-최대상금`] 
완전탐색 & 최적화 문제</br>
각 자릿수를 바꿀 수 있는 기회 횟수에 맞게 바꿔서 숫자를 최대로 만드는 것.</br>
**모든 경우의 수를 다 살펴보고 그 중에서 가장 큰 값을 출력하는 DFS**를 이용했다.</br>

```java
public static void DFS(int start, int count) {
        if (count == exchange) {
            // Math.max() 이용한 큰 값 찾기 ...
        } else {
            for (int i = start; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    String tmp = arr[i]; // SWAP
                    arr[i] = arr[j];
                    arr[j] = tmp;

                    DFS(i, count + 1); // 교환 횟수 하나 증가

                    // 다시 원래 상태로 복구 
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
```

