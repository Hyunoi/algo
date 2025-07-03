import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M;
    static int N;
    static Queue<int[]> queue;
    static int[][] farm;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void BFS() {
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            int getY = xy[0];
            int getX = xy[1];

            for (int i = 0; i < 4; i++) {
                int moveX = getX + dx[i];
                int moveY = getY + dy[i];

                if (moveX >= 0 && moveX < M && moveY >= 0 && moveY < N) {
                    if (farm[moveY][moveX] == 0) {
                        queue.add(new int[]{moveY, moveX});
                        farm[moveY][moveX] = farm[getY][getX] + 1;
                    }
                }
            }
        }
    }

    public static int findMax() {
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] > max)
                    max = farm[i][j];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        farm = new int[N][M];
        queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int tomato = Integer.parseInt(st.nextToken());
                if (tomato == 1) queue.add(new int[]{i, j}); // y, x (세로, 가로)
                farm[i][j] = tomato;
            }
        }

        BFS();
        int max = findMax() - 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(max);
    }
}
