`Greedy Algorithm`

`Comparable`
##### 정렬하는 기준을 잡아주는 Comparable
```java
class Point implements Comparable<Point> { 
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) { 
        /* x기준으로 오름차순 정렬 후 값이 같은 x는 y기준 오름차순 */
        if (this.x == o.x) 
            return this.y - o.y;  
        else
            return this.x - o.x;  
    }
}

// 사용할 때는 
Collections.sort(arr);
```

🦔`씨름선수`🦔
```java
 @Override
public int compareTo(Body o) {
        return o.h - this.h;  // 키 기준 내림차순 정렬
}
// ...
for (Body o : arr) {
            if (o.w > max) { // 키로 정렬 후 몸무게가 크면 선수 출전가능
                max = o.w;
                count++;
            }
        }
```

🦔`회의실 배정`🦔
```java
 for (Time o : arr) {
            if (o.s >= et) { // 전의 끝난 시간이 출발시간보다 같거나 작으면
                count++;
                et = o.e; // end time은 해당 객체의 끝나는 시간으로
            }
        }
```


🦔`결혼식`🦔
```java
 int count = 0; // 동시에 존재하는 인원
        for (Time o : arr) {
            if (o.state == 's') count++;  // 's' 입장한 상태 
            else count--;  // 'e'는 나간 상태 
            answer = Math.max(answer, count);
        }
```

`PriorityQueue` </br>
##### 큐에서 가장 큰 값 또는 가장 작은 값을 우선으로 poll하는 큐 

</br>

🦔`최대수입 스케줄`🦔
```java
 int count = 0; // 동시에 존재하는 인원
        for (Time o : arr) {
            if (o.state == 's') count++;  // 's' 입장한 상태 
            else count--;  // 'e'는 나간 상태 
            answer = Math.max(answer, count);
        }
```
