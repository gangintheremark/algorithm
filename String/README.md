`문자찾기`

```java
str.toUpperCase();  // String형 변수 대문자 변환한 반환값
char c = Character.toUpperCase(c);  // char형 변수 대문자 변환한 반환값
s.next().charAt(0) // char 변수 입력받기
```

`대소문자 변환`

```java
String answer 👉 answer += c;
ArrayList<String> answer 👉 anwser.add(c);
```

`문장 속 단어찾기`

```java
// split()
String[] s = str.split(" "); // 공백 기준으로 문장 자르기
```

`문자 뒤집기_01_`

```java
 StringBuilder sb = new StringBuilder(s.next()); // StringBuilder
 System.out.println(sb.reverse()); // reverse()
```

`문자 뒤집기_03_ (직접 뒤집기)`

```java
char[] c = x.toCharArray(); // String 을 char형 배열로
String tmp = String.valueOf(c); // char 배열을 String으로
```

💡 `이 문제에서 ArrayList<String> 자료형을 사용한 이유?`<br/>
문자열을 저장하고 반환하는데 있어 String[] 자료형을 사용할 수도 있지만
ArrayList는 문자열의 개수가 가변적일때도 처리하기 쉬우며, 동적으로 추가하거나 삭제할 수 있다는 장점이 있다.

즉, 크기가 고정적이고 변경이 필요하지 않은 경우에는 String[]<br/>
크기가 가변적이거나 동적으로 변경되어야 하는 경우에는 ArrayList<String> <br/>

`특정 문자뒤집기`

```java
Character.isAlphabetic(c) // 알파벳인지
```

`중복문자 제거`

```java
str.indexOf(str.charAt(i)) // str.indexOf('A') str에서 A의 위치 (처음위치)
```

`회문문자열`

```java
// StringBuilder를 이용하여 역순으로 재배치 후 비교
String tmp = new StringBuilder(str).reverse().toString();

str.equals(tmp); // 문자열 비교
str.equalsIngnoreCase(tmp); // 대소문자 무시하고 비교
```

`팰린드롬 (replaceAll 정규식 이용)`

```java
str = str.toUpperCase().replaceAll("[^A-Z]","");  //A-Z가 아닌 것은 전부 ""로 대체
```

`숫자만 추출`

```java
//isDigit() 사용
Character.isDigit(x) // 숫자면 true
if (x >= 48 && x <= 57) // 숫자면 (아스키코드)
     answer = answer * 10 + (x - 48);  // 앞에 0일때 0없애고 숫자만들기
```

`가장 짧은 문자거리`

```java
// 1. 첫 거리재고  2. 뒤에서 부터 거리 쟀을 때 3. 비교해서 더 짧은 길이
Math.min(answer[i], p);  // Math.min 사용
```

`문자열 압축`

```java
str = str + " ";  // 핵심
answer += String.valueOf(count); // String 문자열에 int 숫자 + 하기
```

💡`for-each문` <br/>
for(char형 변수 : char형 배열) <br/>
for(String형 변수 : String형 배열) <br/><br/>
