class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) // 짝수 판단
                answer = answer + i; // 짝수이면 값 추가
        }
        return answer;
    }
}