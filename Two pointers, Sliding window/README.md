### 효율성 O(n^2) 👉 O(n) </br></br>

![two pointers, sliding window](https://velog.velcdn.com/images/iberis/post/6fc5e78d-ca22-4f96-ac48-1328ef03981f/image.jpg)

`투포인터 알고리즘(two pointer)`  </br>
- 리스트에 순차적으로 접근해야 할 때 **두 개의 점의 위치를 기록하면서 처리**하는 알고리즘 </br>

`슬라이딩 윈도우(Sliding window)` </br>
- 고정 사이즈의 윈도우가 이동하면서 윈도우 내에 있는 데이터를 이용해 문제를 풀이하는 알고리즘</br>
- **교집합의 정보를 공유하고, 차이가 나는 양쪽 끝 원소만 갱신**하는 방법이다 </br>

  🐰`공통원소 구하기`🐰
```java
 Arrays.sort(a);  //  배열 오름차순 정렬
 ```

   🐰`최대 매출`🐰
   ```java
   /* N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액 */ 
   sum += (arr[i] - arr[i-k])  //양쪽 끝 원소 갱신 
   ```

      🐰`연속부분수열`🐰
   ```java
   //* N개의 수열에서 연속부분수열의 합이 M이 되는 경우가 몇 번인지 */
  while(sum >= m) {   // sum이 m보다 작을때 까지 lt값 뺴주기
      sum -= arr[lt++];
      if(sum == m) answer++;
  }
   ```