class Solution {
    public int[] solution(int[] arr) {
        int len = 0; // 배열길이 변수
		int count = 0; // 카운터 변수
		int idx = 0; // 인덱스 변수
		for (int i = 0; i < arr.length; i++) {
			len += arr[i]; // 길이 계산
		}
		int[] answer = new int[len]; // 배열 길이 선언
		
		while(arr.length > count) {
			for (int i = 0; i < arr[count]; i++) {
				answer[idx] = arr[count]; // 해당 인덱스의 값 만큼 배열에 저장
				idx++; // 인덱스 증가
			}
			count++; // 카운터 증가
		}
        return answer;
    }
}