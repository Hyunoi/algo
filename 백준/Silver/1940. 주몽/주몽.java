import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int nList[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nList);

        int start = 0;
        int end = n-1;
        int cnt = 0;

        while (start < end) {
            int sum = nList[start] + nList[end];

            if (sum == m) {
                start++;
                end--;
                cnt++;
            } else if (sum > m) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(cnt);
    }
}