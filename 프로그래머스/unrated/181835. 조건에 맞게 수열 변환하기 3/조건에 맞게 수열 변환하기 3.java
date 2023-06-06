class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
			arr[i] = k % 2 != 0 ? arr[i] * k : arr[i] + k ; // 홀수 짝수 판단후 계산
		}
		answer = arr; // 배열값 전달하기
        return answer;
    }
}