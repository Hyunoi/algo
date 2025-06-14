import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nTile = new int[n+1];

        nTile[1] = 1;
        
        if (n >= 2) nTile[2] = 2;

        for (int i = 3; i <= n; i++)
            nTile[i] = (nTile[i-1] + nTile[i-2]) % 10007;

        System.out.println(nTile[n]);
    }
}
