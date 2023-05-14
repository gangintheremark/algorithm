import java.util.*;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map1.put(players[i], i);
            map2.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int rank = map1.get(callings[i]);
            String player = map2.get(rank);

            String front = map2.get(rank-1);

            map1.replace(front, rank);
            map1.replace(player, rank - 1);
            map2.replace(rank, front);
            map2.replace(rank-1, player);
        }
        for (int i = 0; i < players.length; i++) {
            answer[i] = map2.get(i);
        }
        return answer;
    }
}

