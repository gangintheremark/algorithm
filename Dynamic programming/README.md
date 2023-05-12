`Dynamic Programming` : 동적계획법 </br>
하나의 큰 문제를 여러 개의 작은 문제로 나눠 그 결과를 저장 후 다시 큰 문제를 해결할 때 사용하는 것 



🐶`계단 오르기`🐶 </br>
🐶`돌다리 건너기`🐶</br>
계단 문제는 n번째 계단까지 오를 때 방법횟수로 dy[n]이 정답</br>
돌다리 문제는 n개의 돌을 건너뛰어 완전히 건넜을 때 방법횟수로 dy[n+1]이 정답</br>

🐶`최대부분 증가수열`🐶 : LIS, Longest Increasing Subsequence </br>
첫번째 원소부터 n번째 원소까지 '마지막항'이라 생각하고 증가수열 길이 구하기
```java
 for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) { // i보다 앞쪽에 있는 것들 탐색
                if (arr[j] < arr[i] && dy[j] > max) // i값보다 작고 dy[j]값이 가장 큰 수
                    max = dy[j];
            }
            dy[i] = max + 1; // i에 부분 증가수열 길이 넣기
            answer= Math.max(answer, dy[i]); // 최대 부분 증가수열 값 넣기
        }
```


🐶`가장 높은 탑 쌓기`🐶 : LIS, Longest Increasing Subsequence </br>
첫번째 벽돌부터 n번째 벽돌까지 '맨 위에 오는 벽돌'이라 생각하고 가장 긴 높이 구하기
```java
 for (int i = 1; i < arr.size() ; i++) {
            int max_h = 0;
            for (int j = i-1; j >= 0 ; j--) { // i보다 앞의 벽돌 탐색
                if (arr.get(j).w > arr.get(i).w && dy[j]>max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
```