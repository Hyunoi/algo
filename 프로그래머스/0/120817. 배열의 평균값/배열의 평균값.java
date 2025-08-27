import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        int total = 0;
        for (int n : numbers) total += n;
        return (double) total / numbers.length;
    }
}