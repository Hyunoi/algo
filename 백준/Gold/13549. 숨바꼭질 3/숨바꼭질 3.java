import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Node {
        int index;
        int count;

        Node(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }

    static int n, k;;
    static int min = Integer.MAX_VALUE;
    static int max = 100001;

    public static void BFS() {
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[max];
        queue.add(new Node(n, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            visited[node.index] = true;
            if (node.index == k) {
                min = Math.min(node.count, min);
            }

            if (node.index * 2 < max && !visited[node.index * 2]) queue.add(new Node(node.index * 2, node.count));
            if (node.index + 1 < max && !visited[node.index + 1]) queue.add(new Node(node.index + 1, node.count + 1));
            if (node.index - 1 >= 0 && !visited[node.index - 1]) queue.add(new Node(node.index - 1, node.count + 1));
        }
        System.out.println(min);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        BFS();
    }
}
