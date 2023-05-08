class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
		while (chicken >= 10) { 
			coupon = chicken / 10; // 쿠폰 계산
			chicken = chicken % 10 + coupon; // 다시 먹은 치킨 + 쿠폰
			answer = answer + coupon;
		}
        return answer;
    }
}