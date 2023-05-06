### **`stack`**
```java
Stack<Character> stack = new Stack<>();
stack.push(x);
stack.pop();
stack.peek();
stack.isEmpty();
stack.get(i); // stack의 i번째 return
stack.size(); // stack에 있는 원소의 개수
```


🦝`괄호제거`🦝 </br>
괄호문제 나오면 보통 stack문제
```java
 while (stack.pop() != '(') ;  // '('문자가 나올때까지 스택제거

 for (int i = 0; i < stack.size(); i++)
        answer += stack.get(i);     // String 변수에 스택값 추가 
```

🦝`크레인 인형뽑기`🦝 
```java
if(stack.peek() == tmp)  // stack 맨 위 값과 비교 후 
    stack.pop(); // pop 하는 구조
```

🦝`후위연산식`🦝 
```java
 if (Character.isDigit(x)) 
     stack.push(x - 48); // 문자로 입력된 숫자면 Integer 스택에 push 하기위해 -48 

answer = stack.get(0);  // 스택값 넣기
```