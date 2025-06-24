import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count;
    static int n;
    static int[] visited;
    static int[][] graph;

    public static void DFS(int node) {
        visited[node] = 1;

        for (int i = 1; i < n+1; i++) {
            if (graph[node][i] == 1 && visited[i] != 1)
                DFS(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        visited = new int[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        for (int i = 1; i < n+1; i++) {
            if (visited[i] != 1) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
