class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int i=0;
        while (i < t) {
			n = n * 2;
            answer = n;
			i++;
		}
        
        return answer;
    }
}