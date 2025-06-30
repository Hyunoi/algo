import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int[][] visited;
    private static int n;
    private static int m;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void BFS(int y, int x) {
        // n 세로, m 가로
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {y, x});
        visited[y][x] = 0;

        while (!q.isEmpty()) {
            int[] xy = q.poll();
            int getY = xy[0];
            int getX = xy[1];

            for (int i = 0; i < 4; i++) {
                int moveY = getY + dy[i];
                int moveX = getX + dx[i];

                if (moveX >= 0 && moveX < m && moveY >= 0 && moveY < n) {
                    if (map[moveY][moveX] != 0 && visited[moveY][moveX] == -1) {
                        q.add(new int[] {moveY, moveX});
                        visited[moveY][moveX] = visited[getY][getX] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        int startY = 0;
        int startX = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    startY = i;
                    startX = j;
                }
            }
        }

        visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j< m; j++) {
                visited[i][j] = -1;
            }
        }

        BFS(startY, startX);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) System.out.print(0 + " ");
                else System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
    }
}
