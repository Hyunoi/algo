class Solution {
    public String solution(String s) {
        int length = s.length();
        if (s.length() % 2 != 0) {
            return String.valueOf(s.charAt(length / 2));
        } else {
            return s.substring((length / 2) - 1, length / 2 + 1);
        }
    }
}