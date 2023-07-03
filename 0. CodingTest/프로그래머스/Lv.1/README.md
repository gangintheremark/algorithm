`stream()`
```java
/* int[] 배열 arr의 total합 */
int sum = Arrays.stream(arr).sum();

/* int[] 배열 arr의 최대값, 최소값 찾기 */
int max = Arrays.stream(arr).max().getAsInt();
int min = Arrays.stream(arr).min().getAsInt();

/* 배열 arr의 평균값을 double형으로 return */
double tmp = Arrays.stream(arr).average().getAsDouble(); 
```
</br>

`valueOf()`
```java
int answer = Integer.valueOf(s); // 문자를 숫자로 변환 "
String str = String.valuOf(n); // 숫자를 문자로 변환 1 -> "1" 

/* 문자열을 공백 기준 배열로 변환 */
String[] arr = str.split(" "); 

/* int를 String배열로 변환 */
int n = 118372;
String[] str = String.valueOf(n).split(""); // 118372를 String 배열로 
```
</br>

```java
// String[] 배열에 존재하는 숫자들 값 더하기
String[] s = String.valueOf(n).split("");
for(String str : s) 
    sum += Integer.parseInt(str);

// String에서 특정 문자 위치 찾기
int index = str.indexOf("3");
// String[] 배열에서 특정 문자열 위치 찾기
int index = Arrays.asList(arr).indexOf("Kim");

// String 문자열에서 일부분 바꾸기 -> char배열로 바꾼 후 반복문
Char[] ch = phone_number.toCharArray();
String str =  String.valueOf(ch); 
```
</br>

`String 메소드`
```java

String s, s1, s2;
        
/* 대소문자 변환 */
s.toUpperCase(); //대문자로
s.toLowerCase(); //소문자로

s.contains("Java"); // 해당 문자열이 포함된다면 true , 아니면 false
        
s.indexOf("Java"); // 처음 일치하는 위치정보 ,포함되지 않는다면 -1
s.lastIndexOf("and"); // 마지막에 일치하는 위치정보

s.startsWith("I like"); // 해당 문자열로 시작하면 true
s.endsWith("."); // 해당 문자열로 끝나면 true

s.replace("and", ","); // "and"를 ","로 변환
s.toUpperCase().replaceAll("[^A-Z]","");  //A-Z가 아닌 것은 전부 replace

s.substring(7); // index 기준 7번째 부터 시작 (이전 내용삭제)
s.substring(s.indexOf("Java")); // "Java" 부터 시작 (이전 내용삭제)
s.substring(s.indexOf("Java"), s.indexOf(".")); // 시작 위치부터 끝 위치 "직전까지"

s.trim(); // 앞뒤 공백 모두 제거
    
s1.concat(",").concat(s2); // s1 , s2 결합

s1.equals(s2); // 문자열 내용이 같으면 true
s2.equalsIgnoreCase(s1); // 대소문자 구분없이 같으면 true

Character.isAlphabetic(c)  // 알파벳인지
Character.isDigit(x)  // 숫자인지

// StringBuilder를 이용하여 역순으로 재배치 후 다시 String 형으로
String tmp = new StringBuilder(str).reverse().toString();  
```

`최대공약수` 와 `최소공약수`
```java
/* 유클리드 호제법 */
public static int gcd(int a, int b) { // 최대공약수
    if (b == 0) return b;
    return gcd(b, a%b);
}
public int[] solution (int a, int b) {
    int[] answer = new int[2];

    answer[0] = gcb(a,b);
    answer[1] = (a*b) / answer[0];  // 최소공배수 
    return answer;
}
```

- 배열 뒤에 안쓰이는 초기값(0) 제거하고 싶을 때,  </br>
```java
int[] result = new int[count]; // arr에서 입력된 부분을 count한 수 
System.arraycopy(arr, 0 ,result, 0, count);
```
