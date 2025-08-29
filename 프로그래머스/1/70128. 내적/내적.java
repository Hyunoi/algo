class Solution {
    public int solution(int[] a, int[] b) {
        int length = a.length;
        int result = 0;
        for (int i = 0; i < length; i++) result += a[i] * b[i];
        return result;
    }
}