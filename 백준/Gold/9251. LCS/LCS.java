import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int lenA = a.length();
        int lenB = b.length();
        int[] aList = new int[lenA+1];
        int[] bList = new int[lenB+1];
        int[][] map = new int[lenA+1][lenB+1];

        for (int i = 1; i < lenA+1; i++) aList[i] = a.charAt(i-1);
        for (int i = 1; i < lenB+1; i++) bList[i] = b.charAt(i-1);

        for (int i = 1; i < lenA+1; i++) {
            for (int j = 1; j < lenB + 1; j++) {
                if (aList[i] == bList[j])
                    map[i][j] = map[i - 1][j - 1] + 1;
                else if (aList[i] != bList[j])
                    map[i][j] = Math.max(map[i][j - 1], map[i - 1][j]);
            }
        }
        
        int max = 0;
        for (int num : map[lenA])
            if (max < num) max = num;
        System.out.println(max);
    }
}