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

        int sList[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sList[i] = nList[i];
            } else {
                sList[i] = sList[i-1] + nList[i];
            }
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt() - 1;  // 2 -> 1
            int j = sc.nextInt() - 1;  // 4 -> 3

            int result = 0;
            if (i == 0) {
                result = sList[j];
            } else {
                result = sList[j] - sList[i - 1];
            }
            System.out.println(result);
        }
    }
}
