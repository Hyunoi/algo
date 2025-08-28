import java.util.*;

class Solution {
    public long solution(long n) {
        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);
        
        StringBuilder sb = new StringBuilder(new String(num));
        sb.reverse();
        return Long.parseLong(sb.toString());
    }
}