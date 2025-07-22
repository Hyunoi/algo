import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N+1][N+1];
        int[][] plusMap = new int[N+1][N+1];

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N+1; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        // plusMap: 0,0 부터 해당 인덱스까지의 합
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                plusMap[i][j] = map[i][j]
                        + plusMap[i - 1][j]
                        + plusMap[i][j - 1]
                        - plusMap[i - 1][j - 1];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = plusMap[x2][y2]
                    - plusMap[x1-1][y2]
                    - plusMap[x2][y1-1]
                    + plusMap[x1-1][y1-1];

            System.out.println(result);
        }
    }
}
