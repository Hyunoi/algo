import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> numList = new ArrayList<>();

        while (n > 0) {
            int num = (int) (n % 10);
            n = n / 10;
            numList.add(num);
        }

        // ArrayList → int[] 변환
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }
}