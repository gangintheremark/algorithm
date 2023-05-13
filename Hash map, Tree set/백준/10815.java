import java.io.*;
import java.util.*;

public class Main {
    static int n, m;

    public void solution(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for(int x : a)
            map.put(x, map.getOrDefault(x, 0)+1);

        for(int x : b) {
            if (map.containsKey(x))
                System.out.print(1 +" ");
            else
                System.out.print(0 + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        
    }
}
