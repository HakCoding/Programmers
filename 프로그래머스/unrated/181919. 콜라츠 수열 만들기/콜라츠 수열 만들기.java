class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 1;		
		int[] arr = new int[1000]; // 새로운 배열 선언
		arr[0] = n; // 첫번째 배열값 저장
		while (n != 1) {
			n = n % 2 != 0 ? (3 * n) + 1 : n / 2; // 홀수면 앞에 조건 짝수면 뒤에 조건 수행
			arr[count] = n; // 배열에 n 값 저장
			count++; 
		}
		answer = new int[count]; // 카운터 크기만큼 배열 선언
		for (int i = 0; i < answer.length; i++) answer[i] = arr[i]; //배열값 저장

        return answer;
    }
}