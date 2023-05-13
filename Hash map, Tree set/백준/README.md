- [10815_숫자 카드](https://www.acmicpc.net/problem/10815)</br>

HashMap 사용해서 풀기</br>

- [14425_문자열 집합](https://www.acmicpc.net/problem/14425)</br>

키 값에 존재하는지만 파악만 하면돼서 value값을 그냥 0으로 두고 map.put함. </br>
또 다 입력받고나서 map 만들어 푸는 것보다 입력받을때마다 비교하면서 푸는게 훨신 빠르다. </br>

- [7785_회사에 있는 사람](https://www.acmicpc.net/problem/7785)
```java
// HashMap의 Key를 사전 순의 역순으로 출력하려 한다.
  ArrayList<String> arr = new ArrayList<String>(map.keySet());
  Collections.sort(arr, Collections.reverseOrder());
```

- [1620_나는야 포켓몬 마스터 이다솜](https://www.acmicpc.net/problem/1620)</br>

와,,,, HashMap 특정 key값 어케 출력하는지 몰라서 고생좀 했다 ;;; 결론은 기본 HashMap은 연결되어있는 구조가 아니라서 순서가 뒤죽박죽 저장된다. 따라서 `LinkedHashMap<br>()` 로 HashMap 선언해야 되고 i번째에 있는 key 값 가져오려면 
`map.keySet().toArray()` 로 배열로 받아와서 찾기  </br>
`7785_회사에 있는 사람` 문제는 Key 집합을 배열로 받아와서 sort하였다. 이문제는 정렬하면 안되는 문제라서.. 상황에 따라 두 개 중에 알맞은거 사용하면 될듯
```java
 HashMap<String, Integer> map = new LinkedHashMap<>(); 
// ...

Object[] keyArr = map.keySet().toArray();

    for (int i = 0; i < m; i++) {
        String test = br.readLine(); // 문제 입력받기

        if (Character.isDigit(test.charAt(0))) { // 문제가 숫자라면
            System.out.println(keyArr[Integer.parseInt(test) -1]);
        }
        else
            System.out.println(map.get(test));
    }

```

- [10816_숫자카드2](https://www.acmicpc.net/problem/10816)</br>
시간초과 진짜 매우 스트레스받게한다 하...... 그냥 반복문 내에서 system.out.print 써서 출력하는 것보다 `StringBuilder`만들어서 `append`한 다음에 출력하니 해결됐다. </br>
근데 그냥 bw.write 하니 되네 ㅋ
```java
for (int i = 0; i < m; i++) {
    int tmp = Integer.parseInt(st.nextToken());
    if (map.containsKey(tmp))
            sb.append(map.get(tmp)).append(" ");
    else
            sb.append("0 ");
}
System.out.println(sb.toString());
```

- [1764_듣보잡](https://www.acmicpc.net/problem/1764)</br>
ArrayList 배열 오름차순,내림차순 정렬은 Collections.sort(arr) 와   Collections.sort(arr, Collections.reverseOrder()) 이용

- [1269_대칭차집합](https://www.acmicpc.net/problem/1269)</br>
else map.replace(tmp, 1); put 보다 시간 더 줄이기 가능</br>