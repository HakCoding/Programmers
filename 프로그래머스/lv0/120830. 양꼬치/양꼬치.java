class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count = n / 10; // 음료 서비스 계산
        answer = (n*12000) + ((k-count)*2000); // 총 금액 계산
        return answer;
    }
}