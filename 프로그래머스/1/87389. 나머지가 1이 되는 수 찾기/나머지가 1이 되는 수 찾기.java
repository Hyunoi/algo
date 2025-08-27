class Solution {
    public int solution(int n) {
        int min = 1000000;
        for (int i = 2; i <= n; i++) {
            if (n % i == 1 && min > i) min = i;
        }
        return min;
    }
}