import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] mList;
    static int N;   // 리스트 길이
    static int M;   // result 길이

    public static void DFS(int startIdx, int depth) {
        if (depth == M) {
            for (int m : mList)
                System.out.print(m + " ");
            System.out.println();
            return;
        }

        for (int i = startIdx; i < N+1; i++) {
            mList[depth] = i;
            DFS(i+1, depth+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        mList = new int[M];
        DFS(1, 0);
    }
}
