### **`HashMap`** 
👉 key : value 구조
```java
HashMap<Character, Integer> map = new HashMap<>(); // Hashmap<key, value> 설정
map.put(x, map.getOrDefault(x, 0));  // hashmap 갱신
map.get(x) // x의 키 값
map.getOrDefault(x, 0)  // x의 키 값 또는 없으면 0 

map.containsKey('A'); // 키 중 'A'가 존재하면 true
map.size(); // 키의 개수
map.remove('A'); // 'A' 키 제거 
```

### **`TreeSet`** 
👉 중복 제거 및 순서 정렬 자료구조 (정렬지원 set)
```java
TreeSet<Integer> Tset = new TreeSet<>(); // 오름차순의 treeset
TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순의 treeset

Tset.remove(x); // x 제거
Tset.size(); // 원소의 개수
Tset.first();  // 오름차순에선 최소값, 내림차순에선 최대값 
Tset.last();   // 오름차순에선 최대값, 내림차순에선 최소값
```

☃️`학급 회장`☃️ </br>
```java
//HashMap
 for (char key : map.keySet()) {
           // System.out.println(x + " " + map.get(key));
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
```

☃️`Anagram (아나그램)`☃️ </br>
두 문자열의 알파벳 나열 순서는 다르지만 알파벳 구성이 일치하면 두 단어는 아나그램이라고 한다.
```java
if (!map.containsKey(x) || map.get(x) == 0) //x 라는 키가 존재하지 않거나 x 키 값이 0이면
         return "NO";
map.put(x, map.get(x) - 1);  // 값이 존재하면 -1 해준다.  

// 최종적으로 모든 키 값이 0이되면 두 문자열은 일치
```

☃️`매출액의 종류`☃️  </br>
```java
// HashMap + Sliding window 
 for (int i = 0; i < k; i++) {  //윈도우값 셋팅
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int lt =0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1); 
            answer.add(map.size());

            map.put(arr[lt], map.get(arr[lt]) -1); // 앞으로 밀면서 lt값 빼주기
            if (map.get(arr[lt]) == 0) // 키 값이 0이면 hashmap에서 제거
                map.remove(arr[lt]);
            lt++;
        }
```

☃️`모든 아나그램 찾기`☃️ </br>
```java
// HashMap + Sliding window
        for (char x : b.toCharArray())
            bm.put(x, bm.getOrDefault(x, 0) + 1);

        for (int i = 0; i < b.length() - 1; i++)
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
```

☃️`K번째 큰 수`☃️ </br>
```java
// treeSet 
for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int l = j + 1; l < n; l++)   // n개 중 3장 뽑는 모든 경우의 수 
                    Tset.add(arr[i]  + arr[j] + arr[l]);
```