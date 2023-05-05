`Hash map`
```java
HashMap<Character, Integer> map = new HashMap<>(); // Hashmap<key, value> 설정
map.put(x, map.getOrDefault(x, 0));  // hashmap 갱신
map.get(x) // x의 키 값
map.getOrDefault(x, 0)  // x의 키 값 또는 없으면 0 

```

☃️`학급 회장`☃️
```java
 for (char key : map.keySet()) {
           // System.out.println(x + " " + map.get(key));
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
```