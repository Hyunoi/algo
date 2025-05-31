import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;  // 그냥 자기 자신으로 연속될 때 이미 포함

        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != n) {
            if (sum == n) {
                cnt += 1;
                end += 1;
                sum += end;
            } else if (sum > n) {  // 줄여야 함 (start가 오른쪽으로)
                sum -= start;
                start += 1;
            } else {  // 늘려야 함 (end가 오른쪽으로)
                end += 1;
                sum += end;
            }
        }

        System.out.println(cnt);
    }
}