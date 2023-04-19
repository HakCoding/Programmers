class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num1 = 0, num2 = 0;
        	num1 = common[1] - common[0];
			num2 = common[2] - common[1];
			if (num1 == num2) {
				answer = (common[common.length-1] + (common[1]-common[0]));
			}			
			else{
				answer = (common[common.length-1] * (common[1] / common[0]));
			}
        return answer;
    }
}