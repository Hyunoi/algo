import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] nList = new int[3];

            for (int i = 0; i < 3; i++) {
                nList[i] = sc.nextInt();
            }

            if (nList[0] == 0 && nList[1] == 0 && nList[2] == 0)
                break;

            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for (int i = 0; i < 3; i++) {
                if (max < nList[i]) {
                    max = nList[i];
                    maxIdx = i;
                }
            }

            double input = 0;
            double output = 0;
            for (int i = 0; i < 3; i++) {
                if (i == maxIdx) {
                    output = Math.pow(nList[i], 2);
                } else {
                    input += Math.pow(nList[i], 2);
                }
            }

            if (input == output) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
