import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 배열 정렬
		
		int max1 = numbers[0] * numbers[1]; // 만약 음수면 음수쪽 최댓값 계산
		int max2 = numbers[numbers.length-1] * numbers[numbers.length-2]; // 마지막 2자리 계산
		
		if(max1 < max2) { // 최댓값 판별하기
			answer = max2;
		}
		else {
			answer = max1;
		}
        return answer;
    }
}