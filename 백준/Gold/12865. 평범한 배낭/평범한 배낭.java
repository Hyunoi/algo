import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 물건 개수
        int k = Integer.parseInt(st.nextToken());   // 최대 무게
        int[][] packages = new int[n][2];           // [무게, 가치]
        int[][] DP = new int[n+1][k+1];             // [i번째 물건까지 고려했을 때 최대 무게 j의 가치] -> 총 결과로는 [n, k]의 값이 필요함

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            packages[i][0] = Integer.parseInt(st.nextToken());  // 무게
            packages[i][1] = Integer.parseInt(st.nextToken());  // 가치
        }

        for (int i = 1; i < n+1; i++) {
            int weight = packages[i-1][0];
            int value = packages[i-1][1];

            for (int j = 1; j < k+1; j++) {
                if (j < weight) DP[i][j] = DP[i - 1][j];
                else DP[i][j] = Math.max(DP[i - 1][j], DP[i - 1][j - weight] + value);
            }
        }
        System.out.println(DP[n][k]);
    }
}