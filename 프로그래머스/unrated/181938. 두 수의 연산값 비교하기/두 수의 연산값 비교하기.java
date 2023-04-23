class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmpA=a, tmpB=b;
        int num1, num2 = a * b * 2;
        while(tmpB != 0) {
			tmpA = tmpA * 10;
			tmpB = tmpB / 10;			
		}
        num1 = tmpA + b;
		answer = num1;
		if(num1 < num2) 	answer = num2;
        return answer;
    }
}