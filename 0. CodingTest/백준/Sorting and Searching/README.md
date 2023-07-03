- [1920_수 찾기](https://www.acmicpc.net/problem/1920) </br>
이분검색 !!! 
```java
int lt = 0, rt = n-1;
int mid = (lt + rt) /2;
if(mid == target) //...
else if(mid > target) rt = mid - 1;
else lt = mid + 1;
```