class Solution {
    public int solution(int[][] sizes) {
        int[] x = new int[sizes.length];  // 큰 거 
        int[] y = new int[sizes.length];  // 작은 거
        
        for (int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];
            if (a > b) {
                x[i] = a;
                y[i] = b;
            } else {
                x[i] = b;
                y[i] = a;
            }
        }
        
        int maxX = 0;
        int maxY = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (maxX < x[i]) maxX = x[i];
            if (maxY < y[i]) maxY = y[i];
        }
        
        return maxX * maxY;
    }
}