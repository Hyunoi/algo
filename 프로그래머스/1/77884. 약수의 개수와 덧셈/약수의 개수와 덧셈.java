class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int count = 1;
            for (int num = 1; num <= i/2; num++) {
                if (i % num == 0) count++;
            }
            if (count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        return result;
    }
}