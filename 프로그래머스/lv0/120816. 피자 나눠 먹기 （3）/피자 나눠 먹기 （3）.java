class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        while(slice*answer < n) answer++; //사람수보다 많을때까지 피자 추가
        return answer;
    }
}