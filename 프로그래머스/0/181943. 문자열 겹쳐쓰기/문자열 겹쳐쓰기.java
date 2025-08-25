class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String result = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && i < (overwrite_string.length() + s)) {
                result += (char) overwrite_string.charAt(i-s);
            } else {
                result += (char) my_string.charAt(i);
            }
        }
        return result;        
    }
}