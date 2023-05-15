`달리기 경주` </br>
이중 for문으로 접근했는데 시간초과 떴다 사람과 등수, 두 연관된 데이터가 주어져서 HashMap을 이용했는데 HashMap은 key값으로 value값을 바꾸는 것은 가능하지만 value값으로 key값을 바꾸는 것은 어렵다. 따라서 key값으로 사람과 등수가 둘 다 되도록 HashMap 두 개 선언해서 바꿨다. 근데 다른 사람 풀이에 그냥 Hashmap 하나만 선언해서 불린 이름의 등수 찾은 후, 그냥 기존에 주어진 players 순서를 바꿨다. 천잰가
```java
 public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < players.length; i++)
            indexMap.put(players[i], i);


        for (String calling : callings) {
            int idx = indexMap.get(calling);  // 추월한 선수의 현재 등수

            String temp = players[idx - 1]; // 기존의 players 배열 바꾸기
            players[idx - 1] = players[idx];
            players[idx] = temp;

            indexMap.put(players[idx - 1], idx - 1); // 추월한 사람
            indexMap.put(players[idx], idx); // 추월당한 사람

        }

        return players;
    }
```

</br>

`추억점수` </br>
두 연관된 데이터가 주어져서 HashMap 이용 </br>

`공원산책` </br>
```java
// 1. str.indexof("S");  문자열에서 "S"의 위치
for (int i = 0; i < park.length; i++) {
              if (park[i].contains("S")) {
                pos = new Point(i, park[i].indexOf("S"));
                break;
            }
        }

// 2. Character.getNumericValue()) : 문자로 받은 숫자를 int형으로 변환
 int dist = Character.getNumericValue(routes[i].charAt(2));
```

`바탕화면 정리` </br>
문자열에서 "#"의 위치를 이용해서 풀었다. </br>
시작점과 끝점이 있으면 시작점은 #이 발견된 위치가 제일 작은 수로 설정하고 끝점은 #이 발견된 위치가 제일 큰 수로 설정한다. 이중 for으로 배열 하나씩 보면서 비교했으면 더 깔끔하게 됐을듯
```java
// 다른사람 풀이 
class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                }
            }
        }
        return new int[]{minX,minY,maxX+1,maxY+1};
    }
}
```