### **`정렬`**
01. 선택정렬 
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

02. 버블정렬
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

03. 삽입정렬
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