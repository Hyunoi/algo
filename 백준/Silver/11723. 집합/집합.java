import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] sList = new int[21];   // 공집합 s (0~20)

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num = 0;
            if (!cmd.equals("empty") && !cmd.equals("all")) num = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case "add":
                    sList[num] = 1;
                    break;
                case "remove":
                    sList[num] = 0;
                    break;
                case "check":
                    if (sList[num] == 1) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "toggle":
                    if (sList[num] == 1) sList[num] = 0;
                    else sList[num] = 1;
                    break;
                case "all":
                    for (int j = 1; j < 21; j++) sList[j] = 1;
                    break;
                case "empty":
                    for (int j = 1; j < 21; j++) sList[j] = 0;
                    break;
            }
        }
        System.out.println(sb);
    }
}
