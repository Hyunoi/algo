import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] virusMap;
    static int globalCount;
    static int[] visited;

    public static void DFS(int node, int com) {
        visited[node] = 1;

        for (int i = 1; i < com+1; i++) {
            if (virusMap[node][i] == 1 && visited[i] != 1) {
                globalCount++;
                DFS(i, com);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        virusMap = new int[com+1][com+1];

        // 맵 세팅
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            virusMap[a][b] = virusMap[b][a] = 1;
        }

        visited = new int[com+1];
        DFS(1, com);
        System.out.println(globalCount);
    }
}
