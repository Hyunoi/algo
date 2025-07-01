import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int ans = 0;
        while (N >= 1) {
            N -= 1;
            double two = Math.pow(2, N);

            // 1
            if (r < two && c < two) {
                ans += two * two * 0;
            }
            // 2
            if (r < two && c >= two) {
                ans += two * two * 1;
                c -= two;
            }
            // 3
            if (r >= two && c < two) {
                ans += two * two * 2;
                r -= two;
            }
            // 4
            if (r >= two && c >= two) {
                ans += two * two * 3;
                c -= two;
                r -= two;
            }
        }
        System.out.println(ans);
    }
}
