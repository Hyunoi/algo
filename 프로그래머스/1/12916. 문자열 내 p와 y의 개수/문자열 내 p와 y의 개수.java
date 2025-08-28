class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') pCount += 1;
            else if (s.charAt(i) == 'y') yCount += 1;
        }

        if (pCount == yCount) return true;
        else if (pCount != yCount) return false;
        else if (pCount == 0 && yCount == 0) return false;
        return true;
    }
}