import java.util.*;

public class Main {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph; //arraylist 속 arraylist
    static int[] ch;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) { // v번이 갈 수 있는 리스트
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
        public static void main (String[]args){
            Main T = new Main();
            Scanner s = new Scanner(System.in);

            n = s.nextInt();
            m = s.nextInt();
            graph = new ArrayList<ArrayList<Integer>>(); // graph 객체 생성
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<Integer>()); // 객체 생성
            }
            ch = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int a = s.nextInt();
                int b = s.nextInt();
                graph.get(a).add(b); // a번이 갈 수 있는 리스트에 b추가
            }
            ch[1] = 1;  // 1번노드 check (출발점이니깐)
            T.DFS(1);
            System.out.println(answer);
        }
    }
