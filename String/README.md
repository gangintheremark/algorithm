🐣`문장찾기`🐣

```java
str.toUpperCase();  // String형 변수 대문자 변환 
Character.toUpperCase(t);  // char형 변수 대문자 변환

str.charAt(i) // string 한 문자씩 읽기    
char c = s.next().charAt(0) // char 변수 입력받기
```

🐣`문장 속 단어찾기`🐣

```java
// split()
String[] s = str.split(" "); // 공백 기준으로 문장 자르기

// indexOf(), substring() 
while ((pos = str.indexOf(" ")) != -1) { // 공백 위치 찾기
    String tmp = str.substring(0, pos); // 공백 전까지 자르기 (0~pos)까지
    // 길이가 가장 긴 지 체크 후 다시 반복 
}
```

🐣`문장 뒤집기`🐣
```java
//java.lang.StringBuilder 
 StringBuilder sb = new StringBuilder(s.next()); // StringBuilder 
 System.out.println(sb.reverse()); // reverse()
```