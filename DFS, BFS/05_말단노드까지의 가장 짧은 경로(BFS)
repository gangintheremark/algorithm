import java.util.*;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;
    public int BFS(Node root) { //레벨탐색
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0; // 레벨
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node x = Q.poll();
                if (x.lt == null && x.rt == null) return L;
                if (x.lt != null) Q.offer(x.lt);
                if (x.rt != null) Q.offer(x.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
