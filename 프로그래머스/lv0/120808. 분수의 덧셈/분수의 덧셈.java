class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int num = 0; // 쵀대공배수 변수
        int up = (numer1 * denom2) + (numer2 * denom1); // 분자
		int down = denom1 * denom2; // 분모

		for (int i = 1; i <= up && i <= down; i++) {
			if (up % i == 0 && down % i == 0) {
				num = i; // 최대공배수 구하는 for문
			}
		}
		up = up / num;  // 최대공배수 만큼 분자 약분
		down = down / num; // 최대공배수 만큼 분모 약분
		answer = new int[2];
		answer[0] = up;
		answer[1] = down;
        return answer;
    }
}