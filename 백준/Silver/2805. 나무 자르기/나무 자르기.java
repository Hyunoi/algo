import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] treeList;
    static int n;
    static int m;

    public static long binarySearch() {
        int min = 0;
        int max = treeList[n-1];
        int treeLen = 0;

        while (min <= max) {
            int mid = (min + max) / 2;  // 중간 피봇 구하기
            long sum = 0;

            for (int tree : treeList)
                if (tree > mid) sum += tree - mid;  // 나무가 세팅 길이보다 길다면 커팅 후 길이 더하기

            if (sum >= m) {  // 커팅된 길이가 목표 길이보다 길거나 같다면 세팅 길이를 높여야 함 + 지금 길이가 맞는 걸수도
                treeLen = mid;
                min = mid + 1;
            } else {         // 커팅된 길이가 목표 길이보다 작다면 세팅 길이를 줄여야 함
                max = mid - 1;
            }
        }
        return treeLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        treeList = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            treeList[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(treeList);

        long result = binarySearch();
        System.out.println(result);
    }
}
