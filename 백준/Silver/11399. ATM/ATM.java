import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nList = new int[n];

        for (int i = 0; i < n; i++) nList[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nList);
        int[] sumList = new int[n];

        sumList[0] = nList[0];
        for (int i = 1; i < n; i++) sumList[i] = sumList[i-1] + nList[i];

        System.out.println(Arrays.stream(sumList).sum());
    }
}
