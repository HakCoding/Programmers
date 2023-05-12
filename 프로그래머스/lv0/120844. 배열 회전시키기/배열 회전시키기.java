class Solution {
    public int[] solution(int[] numbers, String direction) {
       int[] answer = new int[numbers.length];
		if (direction.equals("right")) { // right 이면
			answer[0] = numbers[answer.length - 1]; // 배열의 0번째 인덱스 저장
			for (int i = 1; i < answer.length; i++) {
				answer[i] = numbers[i - 1]; // 한칸씩 오른쪽으로 이동
			}
		} 
		else {
			answer[answer.length - 1] = numbers[0]; // left 이면 마지막 인덱스 저장
			for (int i = 0; i < answer.length - 1; i++) {
				answer[i] = numbers[i + 1]; // 한칸씩 왼쪽으로 이동
			}
		}
		return answer;
	}
}