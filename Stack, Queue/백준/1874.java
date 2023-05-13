package test;

import java.util.*;

public class Main {
    static int n, m;

    public void solution(int[] arr) {
        ArrayList<Character> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(j++);
                answer.add('+');
            }
            while (stack.peek() != arr[i]) {
                stack.push(j++);
                answer.add('+');

                if (j == n + 2) {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            answer.add('-');
        }
        for(char x : answer) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        T.solution(arr);

    }
}

