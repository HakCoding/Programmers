class Solution {
    public int solution(int n) {
        int answer = 1; // 피자 판 갯수
        while(answer * 6 % n != 0) { // 피자가 남지 않을때 까지 반복			
			answer++;   // 피자 한판 추가
		}
        return answer;
    }
}