import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(String.valueOf(s.charAt(i)));
        }
        Collections.sort(result, Comparator.reverseOrder());
        return String.join("", result);
    }
}