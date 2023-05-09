import java.util.*;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {  //윈도우값 셋팅
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int lt =0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());

            map.put(arr[lt], map.get(arr[lt]) -1);
            if (map.get(arr[lt]) == 0)
                map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

       int n =s.nextInt();
       int k = s.nextInt();
       int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

       for(int x : T.solution(n,k,arr))
           System.out.print(x + " ");
    }
}