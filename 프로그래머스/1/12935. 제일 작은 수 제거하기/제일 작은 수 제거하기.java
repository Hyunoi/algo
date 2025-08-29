import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int a: arr) numList.add(a);
        
        int min = Collections.min(numList);
        numList.remove(Integer.valueOf(min));
        
        if (numList.isEmpty()) return new int[] {-1};
        else return numList.stream().mapToInt(i -> i).toArray();
    }
}