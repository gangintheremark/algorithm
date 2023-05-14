package test;

import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};

        int[] answer = new int[2];
        int[][] board = new int[park.length][park[0].length()];
        Point pos = null;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    pos = new Point(i, j); // 개의 현재위치
                    break;
                }
            }
            if (pos.x == i) break;
        }
        Point tmp = new Point(pos.x, pos.y);
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < Character.getNumericValue(routes[i].charAt(2)); j++) {

                if (routes[i].charAt(0) == 'E')
                    tmp.y++;
                else if (routes[i].charAt(0) == 'W')
                    tmp.y--;
                else if (routes[i].charAt(0) == 'S')
                    tmp.x++;
                else if (routes[i].charAt(0) == 'N')
                    tmp.x--;
                if (tmp.x >= 0 && tmp.x <= park[0].length() && tmp.y >= 0 && tmp.y <= park.length) {
                    if (park[tmp.x].charAt(tmp.y) == 'X') break;
               // 장애물 안만났을 떄 개 현재위치 갱신 하는 코드 너어야함
                    }
                }

            }
        }
        System.out.println(pos.x + " " + pos.y);
    }

}

