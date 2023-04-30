class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n != 0) {
			answer = answer + n % 10; // 1의 자리숫자를 더한다
			n = n / 10; // 1의 자리 숫자를 버린다
		}
        return answer;
    }
}