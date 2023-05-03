import java.util.Arrays;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1]; // 배열의 길이 계산
        int idx = 0; // 배열 인덱스
		for (int i = start; i >= end; i--) {
			answer[idx] = i; // start 부터 end 까지 배열에 저장
			idx++;  // 인덱스 1씩 증가
		}	
        return answer;
    }
}