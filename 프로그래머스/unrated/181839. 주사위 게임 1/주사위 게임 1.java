class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 == 1 && b % 2 == 1){ // a 와 b가 홀수이면
            answer = a * a + b * b; // a^2 + b^2
        }
        else if (a % 2 == 1 || b % 2 == 1){ // a 와 b가 하나만 홀수이면
            answer = 2 * (a + b); // 2 X (a + b)
        }
        else answer = Math.abs(a-b); // a 와 b 둘다 짝수이면 |a - b|
        return answer;
    }
}