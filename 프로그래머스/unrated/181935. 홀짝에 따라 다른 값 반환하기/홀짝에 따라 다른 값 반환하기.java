class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 0, end = n;
        if (n % 2 == 1) {
			start = 1;
			for (int i = start; i <= end; i = i + 2) {
				answer = answer + i;
			}
		}
		else {
			for (int i = start; i <= end; i = i + 2) {
				answer = answer + i * i;
			}
		}
        return answer;
    }
}