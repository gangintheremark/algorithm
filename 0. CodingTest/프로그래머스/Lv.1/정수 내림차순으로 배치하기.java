import java.util.*;
class Solution {
    public long solution(long n) {
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s, Collections.reverseOrder());
       
        StringBuilder sb = new StringBuilder();
        for(String x : s)
            sb.append(x);
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}