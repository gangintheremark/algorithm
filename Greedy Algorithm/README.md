### **`Greedy Algorithm`**

`Comparable` : 정렬하는 기준을 잡아주는 Comparable
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

----

### `PriorityQueue` </br>
큐에서 가장 큰 값 또는 가장 작은 값을 우선으로 poll하는 큐 

</br>

🦔`최대수입 스케줄`🦔
```java
 // 작은 값을 우선으로 뽑는다.  
  PriorityQueue<Integer> PQ = new PriorityQueue<>();

 // 큰 값을 우선으로 뽑는다.  
 PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder()); 
```

----

`Dijkstra 알고리즘` </br>
- 대표적인 **최단 경로탐색 알고리즘**이다. 기본적으로 다익스트라는 하나의 최단 거리를 구할 때 그 이전까지 구했던 최단 거리 정보를 그대로 사용한다는 특징
- 방향 가중치 그래프

---- 

`Disjoing-Set : Union&Finde` : **서로소** 집합 </br>
###### 암기 ⭐️⭐️
```java
public static int Find(int v) { /
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]); 
    }
public static void Union(int a, int b) { 
    int fa = Find(a); 
    int fb = Find(b);
    if (fa != fb) unf[fa] = fb; 
}
```

🦔`친구인가`🦔
```java
public static int Find(int v) { // v번 학생의 인덱스 번호를 return
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]); // 핵심!! 같이 연결되어있는 정점들을 압축시키는과정
    }
public static void Union(int a, int b) { // a와 b를 하나의 집합으로 만드는 함수
    int fa = Find(a); // a번 학생의 인덱스번호 찾기
    int fb = Find(b); // b번 학생의 인덱스번호 찾기
    if (fa != fb) unf[fa] = fb; // 서로 다르면 같은 집합으로
}
```

----

`MST, Minimum Spanning Tree` : 최소신장(스패닝)트리 
1. `크루스칼 알고리즘`
- 간선의 가중치 합이 최소가 되도록 그래프에서 일부 간선을 선택해서 만든 트리 
- n개의 정점에 (n-1)개의 간선으로 연결된다 👉 사이클이 없다!!

2. `프림 알고리즘` 
- Priority Queue 이용 
- 무방향 가중치 그래프
