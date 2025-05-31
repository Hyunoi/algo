import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int nList[] = new int[n];

        for (int i = 0; i < n; i++) {
            nList[i] = sc.nextInt();
        }

        Arrays.sort(nList);

        int start = 0;
        int end = n-1;
        int cnt = 0;

        while (start < end) {
            int sum = nList[start] + nList[end];

            if (sum == m) {
                cnt++;
                start++;
                end--;
            } else if (sum > m) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(cnt);
    }
}