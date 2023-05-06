### **`stack`**
```java
Stack<Character> stack = new Stack<>();
stack.push(x);
stack.pop();
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