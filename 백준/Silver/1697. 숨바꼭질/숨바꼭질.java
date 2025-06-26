import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int BFS(int start, int end) {
        /*
        1. 큐 만들기
        2. 큐에 start 집어넣기
        3. 큐에 들어있는 값을 -1, +1, *2 순서대로 계산해서 다시 큐에 넣기 + count 올리기
        4. 반복해서 큐에 있는 값 계산, 삽입, count 올리기 진행
        5. end 찾으면 즉시 멈추고 count 반환
         */
        Queue<Integer> q = new LinkedList<>();
        int[] countList = new int[100001];
        q.add(start);

        while (!q.isEmpty()) { // 큐가 비어있지 않다면 반복
            int pollNum = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) next = pollNum + 1;
                else if (i == 1) next = pollNum - 1;
                else next = pollNum * 2;

                if (next >= 0 && next <= 100000 && countList[next] == 0) {
                    countList[next] = countList[pollNum] + 1;
                    if (next == end) {
                        return countList[next];
                    }
                    q.add(next);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if ( n == k ) System.out.println(0);
        else System.out.println(BFS(n, k));
    }
}
