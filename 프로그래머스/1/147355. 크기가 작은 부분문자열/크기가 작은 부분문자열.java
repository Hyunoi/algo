class Solution {
    public int solution(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        int count = 0;
        
        long pNumber = Long.parseLong(p);
        for (int i = 0; i < tLength - pLength + 1; i++) {
            long num = Long.parseLong(t.substring(i, i+pLength));
            if (pNumber >= num) count++;
        }
        return count;
    }
}