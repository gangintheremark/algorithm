```java

        /*  String method  */
        String s, s1, s2;
        
        //대소문자 변환
        s.toUpperCase(); //대문자로
        s.toLowerCase(); //소문자로

        s.contains("Java"); // 해당 문자열이 포함된다면 true , 아니면 false
        
        s.indexOf("Java"); // 처음 일치하는 위치정보 ,포함되지 않는다면 -1
        s.lastIndexOf("and"); // 마지막에 일치하는 위치정보

        s.startsWith("I like"); // 해당 문자열로 시작하면 true
        s.endsWith("."); // 해당 문자열로 끝나면 true

        s.replace(" and", ","); // "and"를 ","로 변환
        s.substring(7); // index 기준 7번째 부터 시작 (이전 내용삭제)
        s.substring(s.indexOf("Java")); // "Java" 부터 시작 (이전 내용삭제)
        s.substring(s.indexOf("Java"), s.indexOf(".")); // 시작 위치부터 끝 위치 "직전까지"

        s.trim(); // 앞뒤 공백 모두 제거
    
        s1.concat(",").concat(s2); // s1 , s2 결합

        s1.equals(s2); // 문자열 내용이 같으면 true
        s2.equalsIgnoreCase(s1); // 대소문자 구분없이 같으면 true

        s1.equals(s2); // 내용이 같은가
        s1 == s2; // 참조하는 곳이 같은가

        Character.isAlphabetic(c)  // 알파벳인지
        Character.isDigit(x)  // 숫자인지

        // StringBuilder를 이용하여 역순으로 재배치 후 다시 String 형으로
        String tmp = new StringBuilder(str).reverse().toString();  
        
        String tmp = String.valueOf(c) // char형 배열을 String형으로
        String answer += String.valueOf(count);  // String 문자열에 정수 추가

        str.toUpperCase().replaceAll("[^A-Z]","");  //A-Z가 아닌 것은 전부 replace

```

`문자찾기`

```java
str = str.toUpperCase();  // String형 변수 대문자 변환한 반환값
c = Character.toUpperCase(c);  // char형 변수 대문자 변환한 반환값
s.next().charAt(0) // char 변수 입력받기
```

`대소문자 변환`
```java
char c; 
String answer = ""; 👉 answer += c; 
ArrayList<String> answer = new ArrayList<>(); 👉 anwser.add(c);
```

`문장 속 단어찾기`
```java
String[] arr = str.split(" "); // 공백 기준으로 문장 자르기
```

`문자 뒤집기_01_`
```java
 StringBuilder sb = new StringBuilder(s.next()); // StringBuilder
 System.out.println(sb.reverse()); // reverse()
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
