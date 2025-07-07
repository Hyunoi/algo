import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] nList;
    static int[] visited;
    static int[] mList;

    public static void DFS(int depth) {
        if (depth == M) {
            for (int m : mList)
                System.out.print(m + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] != 1) {  // 방문한 적 없으면
                visited[i] = 1;
                mList[depth] = nList[i];
                DFS(depth+1);
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nList = new int[N];
        visited = new int[N];
        mList = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nList[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nList);
        DFS(0);
    }
}
