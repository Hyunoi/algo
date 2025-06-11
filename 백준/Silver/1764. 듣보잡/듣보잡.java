import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> nList = new HashSet<>();
        Set<String> mList = new HashSet<>();

        for (int i = 0; i < n; i++) nList.add(br.readLine());
        for (int i = 0; i < m; i++) mList.add(br.readLine());

        List<String> result = new ArrayList<>();

        for (String s : nList) {
            if (mList.contains(s)) result.add(s);
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }
}
