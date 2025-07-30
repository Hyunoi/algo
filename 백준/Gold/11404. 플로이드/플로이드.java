import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        map = new int[n+1][n+1];
        for (int i = 1; i < n+1; i++) {
            Arrays.fill(map[i], (100000*n)+1);
            map[i][i] = 0;
        }



        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (map[a][b] > c) map[a][b] = c;
        }

        for (int mid = 1; mid < n+1; mid++) {
            for (int start = 1; start < n+1; start++) {
                for (int end = 1; end < n+1; end++) map[start][end] = Math.min(map[start][end], map[start][mid] + map[mid][end]);
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (map[i][j] == (100000*n)+1) System.out.print(0 + " ");
                else System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
