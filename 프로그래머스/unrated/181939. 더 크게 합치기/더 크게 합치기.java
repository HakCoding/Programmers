class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmpA, tmpB;
		int sum1, sum2;
		
		tmpA = a;
		tmpB = b;
		while(tmpB != 0) {
			tmpA = tmpA*10;
			tmpB = tmpB / 10;			
		}		
		sum1 = tmpA + b;
		tmpA = a;
		tmpB = b;
		while(tmpA != 0) {
			tmpB = tmpB*10;
			tmpA = tmpA / 10;			
		}		
		sum2 = tmpB + a;
		
		answer = sum1;
		if(sum1<sum2) answer = sum2;
        return answer;
    }
}