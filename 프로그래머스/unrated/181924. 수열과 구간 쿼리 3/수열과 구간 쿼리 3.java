class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int tmp; // 임시 저장 변수
		for (int i = 0; i < queries.length; i++) {
			tmp = arr[queries[i][0]]; // 임시로 저장
			arr[queries[i][0]] = arr[queries[i][1]]; // 해당 인덱스 값 저장
			arr[queries[i][1]] = tmp; // 저장해 두었던 값 저장
		}
		int[] answer = arr; // 배열 복사
		return answer;
    }
}