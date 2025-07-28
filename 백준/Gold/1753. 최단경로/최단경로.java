import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Node>[] graph;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        graph = new ArrayList[v+1];
        dist = new int[v+1];

        for (int i = 0; i <= v; i++) {
            graph[i] = new ArrayList();
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[in].add(new Node(out, w));
        }

        dijkstra(k);

        for (int i = 1; i < v+1; i++) {
            if (dist[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.cost - y.cost);
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.cost > dist[cur.vertex]) continue;

            for (Node next : graph[cur.vertex]) {
                if (dist[next.vertex] > dist[cur.vertex] + next.cost) {
                    dist[next.vertex] = dist[cur.vertex] + next.cost;
                    pq.add(new Node(next.vertex, dist[next.vertex]));
                }
            }
        }
    }

    public static class Node {
        int vertex;
        int cost;

        Node (int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }
}
