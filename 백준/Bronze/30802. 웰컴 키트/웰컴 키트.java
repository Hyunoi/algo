import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] sizeList = new int[6];

        // 이 라인으로 공백 포함된 리스트를 읽고
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 여기에서 분배해주는 것
        for (int i = 0; i < 6; i++) {
            sizeList[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int tSum = 0;

        for (int i = 0; i < 6; i++) {
            if (sizeList[i] == 0) continue;

            int tQuotient = sizeList[i] / t;
            int tRemainder = sizeList[i] % t;
            if ( tQuotient >= 1 && tRemainder == 0 ) tSum += tQuotient;
            else if ( tQuotient >= 1 && tRemainder != 0 ) tSum += (tQuotient + 1);
            else if ( tQuotient == 0 ) tSum += 1;
        }

        int pQuotient = n / p;
        int pRemainder = n % p;

        System.out.println(tSum);
        System.out.println(pQuotient + " " + pRemainder);
    }
}
