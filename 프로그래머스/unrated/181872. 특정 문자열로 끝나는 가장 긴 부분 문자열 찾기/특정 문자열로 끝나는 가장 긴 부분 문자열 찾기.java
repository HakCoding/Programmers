class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int len = pat.length(); // 참조 변수 길이
		String[] arr = myString.split(""); // 한글자씩 배열에 저장
		int index = myString.lastIndexOf(pat); // 참조 인덱스 계산
		for (int i = 0; i <= index+len-1; i++) { // 마지막 문자 길이 계산하여 반복문 실행
			answer += arr[i]; // 문자열 저장
		}
        return answer;
    }
}