class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}   // 배열의 값을 모두 더한다
		answer = sum / numbers.length; // 총합을 배열의 길이 만큼 나눈다
        
        return answer;
    }
}