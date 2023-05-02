import java.util.Arrays;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx = 0; // 배열 인덱스 변수
        for (int i = 1; i <= n; i++) {
			if(i % k == 0) { // k의 배수이면
				answer[idx] = i; // 배열에 저장
				idx++; // 인덱스 증가
			}
        }
        return answer;
    }
}