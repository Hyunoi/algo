class Solution {
    public int solution(int n, int k) {
        int freeDrink = n / 10;
        int total = (12000 * n) + (2000 * (k - freeDrink));
        return total;
    }
}