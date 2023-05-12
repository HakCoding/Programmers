class Solution {
    public int solution(int n) {       
        int answer = 0;		
		int count = 0; // 약수 갯수 카운터 변수
		for (int i = 1; i <= n; i++) {
			count = 0; // 카운터 초기화
			for (int j = 1; j <= n; j++) {
				if(i % j == 0) count++; // 합성수 판단
				if(count >= 3) { // 약수가 3개 이상이면
					answer++; // 변수 증가
					break;
				}
			}
		}
        return answer;
    }
}