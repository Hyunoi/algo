import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[2];
        int removeZero = 0;
        int count = 0;
        
        while (!s.equals("1")) {
            count++;
            int number = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') removeZero++;
                else number++;
            }
            s = Integer.toBinaryString(number);
        }
        
        return new int[] {count, removeZero};
    }
}