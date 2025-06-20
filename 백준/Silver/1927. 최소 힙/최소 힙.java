import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            if (inputNum == 0) {
                Integer min = minHeap.poll();
                System.out.println(min == null ? 0 : min);
            } else minHeap.add(inputNum);
        }
    }
}
