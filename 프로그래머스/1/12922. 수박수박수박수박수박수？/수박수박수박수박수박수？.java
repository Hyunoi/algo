import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int subak = n / 2;
        String 수박 = "수박".repeat(subak);
        sb.append(수박);
        if (n % 2 != 0) sb.append("수");
        return sb.toString();
    }
}