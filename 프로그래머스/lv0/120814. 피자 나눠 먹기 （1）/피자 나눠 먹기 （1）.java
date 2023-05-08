class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n / 7 != 0){ 
            answer = n/7; // 남은 피자를 한조각씩 먹는다
            if(n % 7 !=0){
                answer += 1; // 혹시 못먹은 사람이 있으면 1판 추가
            }
        }
        return answer;
    }
}