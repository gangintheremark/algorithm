🐣`문장찾기`🐣

```java
str.toUpperCase();  // String형 변수 대문자 변환한 반환값
Character.toUpperCase(c);  // char형 변수 대문자 변환한 반환값

str.charAt(i) // string 한 문자씩 읽기   

// str.toCharArray
str.toCharArray() // String 각 문자들을 char형 배열로 
s.next().charAt(0) // char 변수 입력받기
```

🐣`대소문자 변환`🐣
```
Character.toUpperCase(t); // 반환값이므로 char c = Character.toUpperCase(t); 이런 형태
String answer 👉 answer += c;
ArrayList<String> answer 👉 anwser.add(c);
```

🐣`문장 속 단어찾기`🐣

```java
// split()
String[] s = str.split(" "); // 공백 기준으로 문장 자르기

// indexOf(), substring() 
while ((pos = str.indexOf(" ")) != -1) { // 공백 위치 찾기
    String tmp = str.substring(0, pos); // 공백 전까지 자르기 (0~pos)까지
    
    // 길이가 가장 긴 지 체크 후 다시 반복  ...
}
```

🐣`문장 뒤집기_01_`🐣
```java
//java.lang.StringBuilder 
 StringBuilder sb = new StringBuilder(s.next()); // StringBuilder 
 System.out.println(sb.reverse()); // reverse()
```

🐣`문장 뒤집기_03_ (직접 뒤집기)`🐣
```java
char[] c = x.toCharArray(); // String 을 char형 배열로
String tmp = String.valueOf(c); // char 배열을 String으로
```

💡 `이 문제에서 ArrayList<String> 자료형을 사용한 이유?`<br/>
문자열을 저장하고 반환하는데 있어 String[] 자료형을 사용할 수도 있지만
ArrayList는 문자열의 개수가 가변적일때도 처리하기 쉬우며, 동적으로 추가하거나 삭제할 수 있다는 장점이 있다. 

즉, 크기가 고정적이고 변경이 필요하지 않은 경우에는 String[]<br/>
크기가 가변적이거나 동적으로 변경되어야 하는 경우에는 ArrayList<String>  <br/>

🐣`특정 문장뒤집기`🐣
```java
Character.isAlphabetic(c) // 알파벳인지
```

🐣`중복문장 제거`🐣
```java
str.indexOf(str.charAt(i)) // str.indexOf('A') str에서 A의 위치 (처음위치)
```

`for-each문` <br/>
for(char형 변수 : char형 배열)  <br/> 
for(String형 변수 : String형 배열) <br/><br/>