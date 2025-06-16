import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nList = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            nList[i] = Integer.parseInt(st.nextToken());

        int[] resultList = nList.clone();
        Arrays.sort(resultList);

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num: resultList)
            if (!(map.containsKey(num))) map.put(num, count++);

        StringBuilder sb = new StringBuilder();
        for (int num : nList)
            sb.append(map.get(num)).append(" ");

        System.out.println(sb);
    }
}
