class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length()-pat.length()+1; i++) {
			if(myString.substring(i, pat.length()+i).contains(pat)) { // 조건에 만족하면
				answer++; // 변수 증가
			}			
		}
        return answer;
    }
}