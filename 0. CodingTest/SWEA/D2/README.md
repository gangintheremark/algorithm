`백만장자 프로젝트` </br>
배열 맨 뒤에서부터 최대값 찾기가 포인트이다. 최대값보다 작은 값이면 더 큰값이 나오기 전까지 정산 반복! N의 범위가 1,000,000 까지여서 long변수 활용 </br>

`간단한 369게임` </br>
`replaceAll`을 이용하여 간단하게 해결할 수 있다. </br>
```java
 for (int i = 1; i <= n; i++) {
        String tmp = String.valueOf(i);

        if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
            tmp = tmp.replaceAll("[369]", "-");
            tmp = tmp.replaceAll("[0124578]", "");
        }
        System.out.print(tmp + " ");

}
```