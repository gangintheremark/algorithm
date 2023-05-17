`자연수 뒤집어 배열로 만들기`</br>
자연수 자리수를 알고싶으면 문자열로 변경후 문자열 길이 이용</br>
```java
String str = String.valuOf(n);
int[] answer = new int[str.length];
```

`나누어 떨어지는 숫자 배열` </br>
배열을 출력해야하는데 입력값마다 출력 길이가 다를 때, count로 길이 구한 후 배열 선언해주는 방법이 있다. </br>

`제일 작은 수 제거하기` </br>
int[] 로 return해야하는 함수에서 배열의 length가 1이면 -1을 리턴하면 될 때, 배열에 넣을 필요없이 **return new int[] {-1};** </br>

`가운데 글자 가져오기` </br>
`substring`사용
```
String answer = s.substring((s.length()-1) / 2 , s.length()/2 + 1);
```

`문자열 내림차순으로 배치하기` </br>
String을 내림차순 하려한다. char[]배열로 변환 후 Arrays.sort()로 오름차순으로 정렬 후 뒤집으면 된다. 뒤집기위해 StringBuilder 이용!!
```java
char[] c = s.toCharArray();
Arrays.sort(c); // 오름차순으로 정렬
StringBuilder sb = new StringBuilder(); // 괄호안에 c.toString() 해서 선언 시 이상해짐. 직접 String 문자열을 넣거나 append 해줘야한다.
sb.append(c); // 그래서 선언 후 추가하는 것으로 
```

`약수의 개수와 덧셈` </br>
💡제곱수인 경우 약수의 개수가 홀수, 아닌 경우 짝수 </br>

`같은 숫자는 싫어` </br>
int[] 배열에서 연속적으로 나타나는 숫자를 제거하고 남은 수 return 하는 문제.  
👉 스택사용</br>

`3진법 뒤집기`</br>
```java
String a = new StringBuilder(a).reverse().toString();
Integer.parseInt(a,3); // 3진법에서 10진법 변환
```

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