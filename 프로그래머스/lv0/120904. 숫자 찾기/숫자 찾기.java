class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int num2 = num; // num의 길이 구하기위한 변수
		int count = 0;  // 인덱스 계산 변수
        while(num2 != 0) {  // num의 길이 구하면 while
			num2 = num2 / 10;
			count++; 
		}		
		while(num != 0) { //
			if(num % 10 == k ) {				
				answer = count; // k와 같으면 answer에 인덱스 저장
			}
			num = num / 10; // 1의 자리 버림
			count--; // 인덱스 감소
		}		
        return answer;
    }
}