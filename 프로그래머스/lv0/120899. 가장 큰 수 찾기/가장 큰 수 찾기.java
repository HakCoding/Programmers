class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int big = array[0]; // 최댓값 변수 (임시로 지정)
		for (int i = 1; i < array.length; i++) {
			if(big < array[i]) {
                big = array[i]; // 최댓값 교체
				answer[0] = array[i]; //최댓값 저장
				answer[1] = i; // 인덱스 저장
			}
		}
        return answer;
    }
}