import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String[] sList = s.split(" ");
        ArrayList<Integer> sArray = new ArrayList<>();
        
        for (String num: sList) sArray.add(Integer.parseInt(num));
        
        int min = Collections.min(sArray);
        int max = Collections.max(sArray);
        
        return min + " " + max;
    }
}