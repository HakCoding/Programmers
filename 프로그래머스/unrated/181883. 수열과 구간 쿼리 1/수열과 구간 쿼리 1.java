class Solution {
    public int[] solution(int[] arr, int[][] queries) {       
        int idx = 0; // 인덱스 변수
		for (int i = 0; i < queries.length; i++) {
				idx = queries[i][0]; // 인덱스 선언
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {					
				arr[idx]++; // 해당 인덱스의 값 증가
				idx++; // 인덱스 증가
			}
		}
        int[] answer = arr;
        return answer;
    }
}