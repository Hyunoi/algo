import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] apart = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                apart[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N; i++) {
            apart[i][0] = Math.min(apart[i-1][1], apart[i-1][2]) + apart[i][0];
            apart[i][1] = Math.min(apart[i-1][0], apart[i-1][2]) + apart[i][1];
            apart[i][2] = Math.min(apart[i-1][0], apart[i-1][1]) + apart[i][2];
        }

        int min = apart[N-1][0];
        for (int ans : apart[N-1]) if (min > ans) min = ans;
        System.out.println(min);
    }
}
