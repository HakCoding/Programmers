class Solution {
    public int[] solution(int[] arr) {
       int[] answer = new int[arr.length];
		for (int i = 0; i < answer.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) answer[i] = arr[i] / 2;
            // 50이상 이고 짝수이면 나누기 2 한 후 배열에 저장
			else if (arr[i] < 50 && arr[i] % 2 != 0) answer[i] = arr[i] * 2;
            // 50미만이고 홀수면 곱하기 2 한 후  배열에 저장
			else { answer[i] = arr[i]; } //배열에 저장
		}
        return answer;
    }
}