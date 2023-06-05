class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0, sum2 = 0; // 합계 변수
		if(arr1.length != arr2.length) answer = arr1.length > arr2.length ? 1 : -1;
        // 배열 길이가 다르면 비교하여 값 저장
		else {
			for (int i = 0; i < arr1.length; i++) sum1 = sum1 + arr1[i];
            // arr1의 워소들의 합
			for (int i = 0; i < arr2.length; i++) sum2 = sum2 + arr2[i];
            // arr2의 원소들의 합
			if(sum1 == sum2) answer = 0; // 값 같이 같다면 0
			else answer = sum1 > sum2 ? 1 : -1; // 값이 다르면 비교하여 값 저장
		}
        return answer;
    }
}