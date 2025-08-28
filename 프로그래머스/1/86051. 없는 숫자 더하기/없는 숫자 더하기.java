import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        List<Integer> numList = Arrays.stream(numbers)
                                            .boxed()
                                            .collect(Collectors.toList());
        
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if (!numList.contains(i)) sum += i;
        }
        return sum;
    }
}