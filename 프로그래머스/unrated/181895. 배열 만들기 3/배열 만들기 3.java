class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int idx = 0; // 인덱스 변수
		int[] answer = new int[(intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1)]; //배열 길이 선언	
		for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
			answer[idx] = arr[i]; // 첫번째 조건값 배열에 값 저장
			idx++; // 인덱스 증가
		}
		for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
			answer[idx] = arr[i]; // 두번째 조건값 배열에 값 저장
			idx++; // 인덱스 증가
		}
        return answer;
    }
}