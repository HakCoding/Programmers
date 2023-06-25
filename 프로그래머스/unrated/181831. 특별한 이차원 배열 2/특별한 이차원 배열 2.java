class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        	for (int i = 0; i < arr.length; i++) {
			    for (int j = 0; j < arr.length; j++) {
				    if(arr[i][j] != arr[j][i]) { // 배열값 뒤집어서 비교
                        answer = 0; 
                        break; // 참이면 반복문 중지
				}
			}
		}
        return answer;
    }
}