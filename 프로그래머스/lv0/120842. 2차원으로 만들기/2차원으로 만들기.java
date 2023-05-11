import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n]; // 배열 갯수 지정
        int idx = 0; // 인덱스 변수
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {                
                answer[i][j] = num_list[idx]; // 배열값 저장
                idx++;
            }
        }
        return answer;
    }
}