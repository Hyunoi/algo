import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[][] nList = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            nList[i][0] = Integer.parseInt(st.nextToken());
            nList[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nList, (a, b) -> {
            // x 좌표가 동일하다면 y 좌표로 오름차순 정렬해라
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            // x 좌료 다르면 그냥 x 좌표로 오름차순 정렬
            return Integer.compare(a[0], b[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(nList[i][0]).append(" ").append(nList[i][1]).append("\n");
        System.out.println(sb);
    }
}
