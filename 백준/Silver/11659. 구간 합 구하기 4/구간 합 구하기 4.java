import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nList[] = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            nList[i] = nList[i-1] + sc.nextInt();
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int result = nList[j] - nList[i - 1];
            System.out.println(result);
        }
    }
}