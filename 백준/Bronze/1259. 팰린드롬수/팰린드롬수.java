import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String palindrome = br.readLine();

            if (palindrome.equals("0")) break;

            int pLen = palindrome.length();
            String check = "yes";

            for (int i = 0; i < (pLen / 2); i++) {
                if (palindrome.charAt(i) != palindrome.charAt(pLen - i - 1)) {
                    check = "no";
                    break;
                }
            }

            System.out.println(check);
        }
    }
}