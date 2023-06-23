class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) { // 배열 i 반복문
			for (int j = 0; j < board[i].length; j++) { // 배열 j 반복문
				if(i+j <= k) answer += board[i][j]; // 조건에 참이면 값 추가
			}
		}
        return answer;
    }
}