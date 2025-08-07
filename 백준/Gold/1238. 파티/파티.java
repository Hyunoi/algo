import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int n, m, x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Node>> edge = new ArrayList<>();
        ArrayList<ArrayList<Node>> reverseEdge = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            edge.add(new ArrayList<>());
            reverseEdge.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            edge.get(start).add(new Node(end, dist));
            reverseEdge.get(end).add(new Node(start, dist));
        }

        int[] edgeResult = dijkstra(x, edge);
        int[] reverseEdgeResult = dijkstra(x, reverseEdge);

        int[] result = new int[n+1];
        int max = 0;
        for (int i = 1; i < n+1; i++) {
            result[i] = edgeResult[i] + reverseEdgeResult[i];
            if (max < result[i]) max = result[i];
        }
        System.out.println(max);
    }

    public static int[] dijkstra(int start, ArrayList<ArrayList<Node>> map) {
        int[] result = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int current = node.end;

            // 방문한 적 없으면
            if (visited[current]) continue;
            visited[current] = true;

            for (Node next : map.get(current)) {
                // 현재까지 계산된 최소 비용보다,
                // 현재 노드를 거쳐서 다음 노드로 가는 비용이 더 작으면 갱신
                if (result[next.end] > result[current] + next.distance) {
                    result[next.end] = result[current] + next.distance;
                    pq.add(new Node(next.end, result[next.end]));
                }
            }
        }
        return result;
    }

    public static class Node {
        int end;
        int distance;

        public Node (int end, int distance) {
            this.end = end;
            this.distance = distance;
        }
    }
}
