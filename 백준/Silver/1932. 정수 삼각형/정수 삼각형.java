import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] triangle = new ArrayList[N];

        for (int i = 0 ; i < N; i++) {
            triangle[i] = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) triangle[i].add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                int num = triangle[i].get(j);
                if (j == 0) {
                    triangle[i].set(0, num+(triangle[i-1].get(j)));
                } else if (j == i) {
                    triangle[i].set(j, num+(triangle[i-1].get(i-1)));
                } else {
                    int max = Math.max(triangle[i-1].get(j-1), triangle[i-1].get(j));
                    triangle[i].set(j, max+num);
                }
            }
        }

        int max = triangle[N-1].get(0);
        for (int ans : triangle[N-1]) if (max < ans) max = ans;
        System.out.println(max);
    }
}
