### **`Stack`**

![Stack](https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/300px-Data_stack.svg.png)

```java
Stack<Character> stack = new Stack<>();
stack.push(x);
stack.pop();
stack.peek();
stack.isEmpty();
stack.get(i); // stack의 i번째 return
stack.size(); // stack에 있는 원소의 개수
```

### **`Queue`**

![Queue](https://blog.kakaocdn.net/dn/bhvAPe/btqHlVqf0RY/Y4oCoA4wUkEpvIkU80i43K/img.png)

```java
 Queue<Integer> Q = new LinkedList<>();
 Q.offer(x);
 Q.pull();
 Q.peek();
 Q.size();
 Q.contains(x);  // 큐 안에 x가 존재하면 true
```

`괄호제거` </br>
괄호문제 나오면 보통 stack문제

```java
 while (stack.pop() != '(') ;  // '('문자가 나올때까지 스택제거

// stack 값 밑에서 부터 출력
 for (int i = 0; i < stack.size(); i++)
        answer += stack.get(i);     // String 변수에 스택값 추가
```

`크레인 인형뽑기`

```java
if(stack.peek() == tmp)  // stack 맨 위 값과 비교 후
    stack.pop(); // pop 하는 구조
```

`후위연산식`

```java
 if (Character.isDigit(x))
     stack.push(x - 48); // 문자로 입력된 숫자면 Integer 스택에 push 하기위해 -48

answer = stack.get(0);  // 스택값 넣기
```

`공주구하기`

```java
Q.offer(Q.poll); // 맨 앞 것을 뒤로보내기
```

`응급실`

```java
// 클래스 생성
class Person {
    int id;  // 대기순서
    int d;   // 위험도

    public Person(int id, int d) {
        this.id = id;
        this.d = d;
    }
}

  for (int i = 0; i < n; i++)
        Q.add(new Person(i, arr[i]));  //offer이 아닌 add()메소드

    for(Person x : Q) { // 큐 데이터 하나씩 비교해보기
                if (x.d > tmp.d) { // 본인보다 더 위험도가 높은 환자가 있다면
                    Q.add(tmp); // add()메소드
                    tmp = null;
                    break;
                }
            }
```
