import java.util.*;

class Node {
    int data;
    Node lt, rt;  // 왼쪽 주소, 오른쪽 주소 저장
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main {
    Node root;
    public void DFS(Node root) {
        if (root == null) return;
        else {
            System.out.print( root.data + " ");
            DFS(root.lt); //왼쪽 가지
            // System.out.print( root.data + " ");
            DFS(root.rt); //오른쪽 가지
            // System.out.print( root.data + " ");
        }
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}