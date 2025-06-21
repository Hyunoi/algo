import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int white;
    static int blue;
    static String[][] paperList;

    public static void DividePaper(int a, int b, int len) {
        String paperColor = paperList[a][b];

        for (int i = a; i < a + len; i++) {
            for (int j = b; j < b + len; j++) {
                if (!paperColor.equals(paperList[i][j])) {
                    DividePaper(a, b, len / 2);
                    DividePaper(a + (len / 2), b, len / 2);
                    DividePaper(a, b + (len / 2), len / 2);
                    DividePaper(a + (len / 2), b + (len / 2), len / 2);
                    return;
                }
            }
        }
        
        if (paperColor.equals("0")) white++;
        else blue++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paperList = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paperList[i][j] = st.nextToken();
            }
        }

        DividePaper(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
}