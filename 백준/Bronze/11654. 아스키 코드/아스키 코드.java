import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String num = bf.readLine();
        int ascii = num.charAt(0);

        System.out.println(ascii);
    }
}
