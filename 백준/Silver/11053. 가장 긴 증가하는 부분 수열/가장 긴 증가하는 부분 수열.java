import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] nList;

    public static void LIS() {
        int[] DP = new int[N];
        DP[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (nList[j] < nList[i]) {
                    DP[i] = Math.max(DP[j]+1, DP[i]);
                }
            }
            if (DP[i] == 0) DP[i] = 1;
        }

        int max = 0;
        for (int num : DP) {
            if (max < num) max = num;
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nList = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nList[i] = Integer.parseInt(st.nextToken());

        LIS();
    }
}
