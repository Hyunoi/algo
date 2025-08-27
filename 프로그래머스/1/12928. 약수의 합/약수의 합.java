class Solution {
    public int solution(int n) {
        int result = 0;
        int count = 1;
        while (n >= count) {
            if (n % count == 0) {
                result += count;
            }
            count++;
        }
        
        return result;
    }
}