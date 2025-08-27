import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = Integer.toString(n);

        int result = 0;
        for (int i = 0; i < num.length(); i++) result += num.charAt(i) - '0';
        
        return result;
    }
}