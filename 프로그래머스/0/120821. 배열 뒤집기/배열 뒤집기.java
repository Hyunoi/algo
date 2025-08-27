import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int listLength = num_list.length;
        for (int i = 0; i < (listLength / 2); i++) {
            int temp = num_list[i];
            num_list[i] = num_list[listLength-i-1];
            num_list[listLength-i-1] = temp;
        }
        
        return num_list;
    }
}