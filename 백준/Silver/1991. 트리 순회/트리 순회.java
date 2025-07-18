import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Node[] tree;

    public static class Node {
        char value;
        Node left;
        Node right;

        Node(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void PreOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value);
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public static void InOrder(Node node) {
        if (node == null) return;
        InOrder(node.left);
        System.out.print(node.value);
        InOrder(node.right);
    }

    public static void PostOrder(Node node) {
        if (node == null) return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new Node[N+1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char value = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);

            if (tree[value - 'A'] == null) {    // 아직 부모 노드가 존재하지 않을 때
                tree[value - 'A'] = new Node(value);
            }
            if (leftValue != '.') {     // 왼쪽 리프 노드가 존재할 때
                tree[leftValue - 'A'] = new Node(leftValue);
                tree[value - 'A'].left = tree[leftValue - 'A'];
            }
            if (rightValue != '.') {     // 오른쪽 리프 노드가 존재할 때
                tree[rightValue - 'A'] = new Node(rightValue);
                tree[value - 'A'].right = tree[rightValue - 'A'];
            }
        }
        PreOrder(tree[0]);
        System.out.println();
        InOrder(tree[0]);
        System.out.println();
        PostOrder(tree[0]);
    }
}