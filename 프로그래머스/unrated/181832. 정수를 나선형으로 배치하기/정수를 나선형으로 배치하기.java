class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = -1, y = 0;
        int sign = 1;
        int num = 1;
        
        while(true){
            for(int i=0; i<n; i++){
                x += sign;
                answer[y][x] = num++;
            }
            if(--n == 0) break;
            for(int i = 0; i < n; i++){
                y += sign;
                answer[y][x] = num++;
            }
            sign = -sign;
        }
        return answer;
    }
}