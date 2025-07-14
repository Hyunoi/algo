import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] map;
    static int[] visited;

    public static void DFS(int index) {
        Stack<Integer> stack = new Stack<>();
        stack.push(index);

        while (!stack.isEmpty()) {
            int num = stack.pop();

            for (int i : map[num]) {
                if (visited[i] == 0) {
                    visited[i] = num;
                    stack.push(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new ArrayList[N+1];
        visited = new int[N+1];

        for (int i = 0; i < N+1; i++) map[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a].add(b);
            map[b].add(a);
        }
        DFS(1);
        for (int i = 2; i < N+1; i++)
            System.out.println(visited[i]);
    }
}
