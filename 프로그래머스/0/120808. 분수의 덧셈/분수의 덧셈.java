import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        ArrayList<Integer> result = new ArrayList<>();
        int divideNum = check(denom, numer);
        
        result.add(numer / divideNum);
        result.add(denom / divideNum);
        
        return result; 
    }
    
    public int check(int a, int b) {
        while (b != 0) {
            int temp = a % b; // 나머지 구하기
            a = b;
            b = temp;
        }
        return a;
    } 
}