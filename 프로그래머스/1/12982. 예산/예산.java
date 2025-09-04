import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] d, int budget) {
        int result = 0;
        int count = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result > budget) {
                count = i;
                return count;
            }
        }
        return d.length;
    }
}