class Solution {
    public int solution(int balls, int share) {
        long answer = 1; // long으로 선언
		int num = 1; // 분모 변수
		for (int i = share + 1; i < balls+1; i++) {
			answer *= i; // 공통 인자 제외한 펙토리얼 계싼
			answer /= num; // 약분
			num++; // 분모 증가
		}
        return (int)answer;
    }
}