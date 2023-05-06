import java.util.*;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack =new Stack<>();

        for(int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;  // 인형 뽑음
                    if (!stack.isEmpty() && stack.peek() == tmp){  //비어있지 않고, stack 맨 위에 있는 것과 tmp가 같을때,
                        answer+=2;  //2개 없앤다
                        stack.pop();
                    }
                    else
                        stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = s.nextInt();
        int m = s.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = s.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }

}