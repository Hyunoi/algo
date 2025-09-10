import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {
    boolean solution(String s) {
        String[] sList = s.split("");
        Stack<String> stack = new Stack<>();
        
        for (String word: sList) {
            if (word.equals("(")) {
                stack.push("(");
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}