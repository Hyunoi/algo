import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> threeList = new ArrayList<>();
        
        while (n > 0) {
            threeList.add(n % 3);
            n = n / 3;
        }
        
        int result = 0;
        for (int i = 0; i < threeList.size(); i++) result += threeList.get(i) * Math.pow(3, threeList.size() - i - 1);
        
        return result;
        }
}