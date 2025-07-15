import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] nList;
    static int[] visited;
    static int[] mList;
    static Set<String> outputs;

    public static void DFS(int depth) {
        if (depth == M) {
            String result = "";
            for (int num : mList)
                result += (num + " ");
            outputs.add(result);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == 0) {  // 방문한 적 없으면
                visited[i] = 1;     // 방문 체크 하고
                mList[depth] = nList[i];
                DFS(depth+1);
                visited[i] = 0;     // 안에서 다 돌았으니 다시 방문 체크 빼주기
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
        outputs = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nList[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nList);
        DFS(0);

        for (String output : outputs)
            System.out.println(output);
    }
}
