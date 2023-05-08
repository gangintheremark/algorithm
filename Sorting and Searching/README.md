### **정렬**
`선택정렬` 
```java
    for (int i = 0; i < n - 1; i++) {  // i번쨰부터 
        int idx = i;
        for (int j = i+1; j < n ; j++) {  // i+1 ~ n-1까지 비교 후 작으면 i번째 자리로
            if (arr[j] < arr[idx]) idx = j;
        }
        int tmp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = tmp;
    }
    return arr;
```

`버블정렬`
```java
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) { // j가 i보다 한번씩 적게 돌아야한다.
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
       }
    return arr;
```

`삽입정렬`
```java
   for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;  // 삽입될 값
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j]; //삽입될 값보다 크면 뒤로 밀기
                else break;
            }
            arr[j + 1] = tmp; //j가 멈춘지점 뒤에 삽입
        }
        return arr;
```

### **이분검색** </br>
**정렬**된 상태에서 검색
```java
 Arrays.sort(arr); // 정렬된 배열
int lt = 0, rt = n - 1;  // 왼쪽 끝 lt, 오른쪽 끝 rt
while (lt <= rt) {
    int mid = (lt + rt) / 2;
    if (arr[mid] == m) { // 찾는 값 찾으면 return 
        answer = mid + 1;
        break;
    }
    if (arr[mid] > m) rt = mid - 1;  //찾는값이 mid값보다 작으면 rt값 조정 (중간기준 왼쪽부분)
    else lt = mid + 1; // 크면 lt값 조정 (중간기준 오른쪽부분)
 }
```
### **결정 알고리즘** </br>
lt ~ rt 사이에 찾고싶은 답이 분명히 있다라는 확신이 있는 문제에 적용
- [뮤직비디오](https://github.com/gangintheremark/Algorithm/blob/master/Sorting%20and%20Searching/%EB%AE%A4%EC%A7%81%EB%B9%84%EB%94%94%EC%98%A4.java)
- [마구간 정하기](https://github.com/gangintheremark/Algorithm/blob/master/Sorting%20and%20Searching/%EB%A7%88%EA%B5%AC%EA%B0%84%20%EC%A0%95%ED%95%98%EA%B8%B0.java)

🐸`LRU`🐸 </br>
LRU : Least Recently Used
```java
int pos = -1; // pos -1로 초기화하고 1.특정 위치 i로 바뀜 2. 안바뀜 
```

🐸`중복 확인`🐸
```java
 Arrays.sort(arr);  // 배열 정렬 후 arr[i] arr[i+1] 확인
```

🐸`장난꾸러기`🐸
```java
int[] tmp = arr.clone();  // clone하여 복사 후 정렬하여 비교하기
```

🐸`좌표정렬`🐸
```java
class Point implements Comparable<Point> { // 정렬하는 기준을 잡아주는 Comparable
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) // x값이 같으면
            return this.y - o.y;  // y좌표 기준 정렬 (오름차순 : y - o, 내림차순 : o - y)
        else
            return this.x - o.x;  // x값이 다르면 x좌표 기준 정렬
    }
}
//...
int n = s.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            arr.add(new Point(x, y));  // Point 값 입력
        }
        Collections.sort(arr); // 정렬기준에 의해서 정렬
        for (Point o : arr) System.out.println(o.x + " " + o.y);
```


🐸`뮤직비디오`🐸 </br>
```java
// Arrays.stream() 메소드 사용!
 int lt = Arrays.stream(arr).max().getAsInt();  // 배열에서 최대를 int형으로 return
 int rt = Arrays.stream(arr).sum(); // 배열에서 모든 값을 합한 값
```