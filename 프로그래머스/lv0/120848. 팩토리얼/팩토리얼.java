class Solution {
    public int solution(int n) {
        int answer = 0;
        int num= 1; // 계산 변수
		while(num <= n) {
			answer++; // 횟수 증가
            num *= answer; // 계산
		}
        return answer-1;
    }
}