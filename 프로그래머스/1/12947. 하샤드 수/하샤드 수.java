class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int realX = x;
        while (x > 0) {
            sum += x % 10;
            x = (int) x / 10;
        }
        
        if (realX % sum == 0) return true;
        else return false;
    }
}