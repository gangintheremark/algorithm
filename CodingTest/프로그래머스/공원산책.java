import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[] solution(String[] park, String[] routes) {
         int[] answer = new int[2];
        int[][] board = new int[park.length][park[0].length()];
        Point pos = null;
        for (int i = 0; i < park.length; i++) {
              if (park[i].contains("S")) {
                pos = new Point(i, park[i].indexOf("S"));
                break;
            }
        }
        for (int i = 0; i < routes.length; i++) {
            Point tmp = new Point(pos.x, pos.y);
            int dist = Character.getNumericValue(routes[i].charAt(2));
            boolean flag = true;
            for (int j = 0; j < dist ; j++) {

                if (routes[i].charAt(0) == 'E')
                    tmp.y++;
                else if (routes[i].charAt(0) == 'W')
                    tmp.y--;
                else if (routes[i].charAt(0) == 'S')
                    tmp.x++;
                else if (routes[i].charAt(0) == 'N')
                    tmp.x--;
                if (tmp.x >= 0 && tmp.x < park.length && tmp.y >= 0 && tmp.y < park[0].length()) { // 범위 내
                    if (park[tmp.x].charAt(tmp.y) == 'X') flag = false;  // x 만나면 break;
                    }
                else flag = false;
                }
            if (flag) {
                pos.x = tmp.x;
                pos.y = tmp.y;
            }
        }
        answer[0] = pos.x;
        answer[1] = pos.y;
        return answer;
    }
}