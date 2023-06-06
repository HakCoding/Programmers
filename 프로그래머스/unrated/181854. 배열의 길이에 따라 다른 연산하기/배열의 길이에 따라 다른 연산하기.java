class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        if (arr.length % 2 != 0) { // 홀수,짝수 판단
			for (int i = 0; i < arr.length; i = i + 2) {
				arr[i] = arr[i] + n; // 짝수 인덱스에만 n 증가
			}
		} 
		else {
			for (int i = 1; i < arr.length; i = i + 2) {
				arr[i] = arr[i] + n; // 홀수 인덱스에만 n 증가
			}
		}
        return answer = arr;
    }
}