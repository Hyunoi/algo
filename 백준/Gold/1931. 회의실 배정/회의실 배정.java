import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class Meeting {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Meeting[] nList = new Meeting[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            nList[i] = new Meeting(start, end);
        }

        Arrays.sort(nList, (a, b) -> {
            if (a.end == b.end) return a.start - b.start;
            return a.end - b.end;
        } );

        int count = 1;
        int endTime = nList[0].end;
        for (int i = 1; i < N; i++) {
            if (nList[i].start >= endTime) {
                count++;
                endTime = nList[i].end;
            }
        }

        System.out.println(count);

    }
}
