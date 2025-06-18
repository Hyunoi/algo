import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 좌, 우, 상, 하
    static int[] dy = {0, 0, -1, 1};
    static int[] dx = {-1, 1, 0, 0};

    public static void DFS(int[][] graph, int[][] visited, int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int moveY = y + dy[i];
            int moveX = x + dx[i];

            if (moveX >= 0 && moveY >= 0 && moveX < graph[0].length && moveY < graph.length) {
                if (graph[moveY][moveX] == 1 && visited[moveY][moveX] == 0) {
                    DFS(graph, visited, moveY, moveX);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());  // 가로
            int n = Integer.parseInt(st.nextToken());  // 세로
            int k = Integer.parseInt(st.nextToken());
            int[][] visited = new int[n][m];
            int[][] graph = new int[n][m];
            int count = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int mIdx = Integer.parseInt(st.nextToken());
                int nIdx = Integer.parseInt(st.nextToken());
                graph[nIdx][mIdx] = 1;
            }

            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (visited[y][x] == 0 && graph[y][x] == 1) {
                        DFS(graph, visited, y, x);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
