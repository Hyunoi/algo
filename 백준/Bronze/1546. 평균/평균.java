import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scoreList[] = new int[n];

        for (int i = 0; i < n; i++) {
            scoreList[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (scoreList[i] > max) {
                max = scoreList[i];
            }
            sum += scoreList[i];
        }

        double answer = ((double) sum / max * 100) / n;
        System.out.println(answer);
    }
}
