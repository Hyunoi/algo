import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void sticker(int[][] stickerBook, int[][] DP, int n) {
        DP[0][1] = stickerBook[0][1];
        DP[1][1] = stickerBook[1][1];

        for (int i = 2; i < n+1; i++) {
            DP[0][i] = Math.max(DP[1][i-2], DP[1][i-1]) + stickerBook[0][i];
            DP[1][i] = Math.max(DP[0][i-2], DP[0][i-1]) + stickerBook[1][i];
        }

        System.out.println(Math.max(DP[0][n], DP[1][n]));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] stickerBook = new int[2][n+1];
            int[][] DP = new int[2][n+1];

            for (int two = 0; two < 2; two++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) stickerBook[two][j+1] = Integer.parseInt(st.nextToken());
            }

            sticker(stickerBook, DP, n);
        }
    }
}