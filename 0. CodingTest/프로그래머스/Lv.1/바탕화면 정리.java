class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int x = wallpaper[0].length();
        int y = wallpaper.length;

        int sp_x=x;
        int sp_y=x;
        int lp_x=0;
        int lp_y = 0;


        for (int i = 0; i < y; i++) {
             int tmp_s = wallpaper[i].indexOf("#"); // 1
             int tmp_l = wallpaper[i].lastIndexOf("#"); // 4

            if (tmp_s != -1) lp_y = i;

            if (tmp_s != -1 && tmp_s < sp_x) { // 시작점
                sp_x = tmp_s;
                if (sp_y == x)
                    sp_y = i;
            }
            if (tmp_l != -1 && tmp_l > lp_x ) { // tmp_l이 7이 돼야함
                lp_x = tmp_l;
            }
        }

        answer[0] = sp_y;
        answer[1] = sp_x;
        answer[2] = ++lp_y;
        answer[3] = ++lp_x;
        return answer;
    }
}