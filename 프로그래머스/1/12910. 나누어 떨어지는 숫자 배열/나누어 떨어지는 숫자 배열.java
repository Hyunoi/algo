import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int n : arr) if (n % divisor == 0) result.add(n);
        Collections.sort(result);
        
        if (result.isEmpty()) result.add(-1);
        
        
        return result
            .stream()
            .mapToInt(i->i)
            .toArray();
    }
}