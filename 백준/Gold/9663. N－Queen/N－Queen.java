import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, answer;
    static int[] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N];

        chess(0);

        System.out.println(answer);
    }

    public static void chess(int depth) {
        if (depth == N) {
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            board[depth] = i;
            if (validation(depth)) {
                chess(depth+1);
            }
        }
    }

    public static boolean validation(int i) {
        for (int j = 0; j < i; j++) {
            if (board[j] == board[i]) return false;
            if (Math.abs(board[j] - board[i]) == Math.abs(j-i)) return false;
        }
        return true;
    }
}
