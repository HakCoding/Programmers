class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] arr = my_string.split(""); // 한글자씩 배열에 저장
		String str = ""; // 비교할 문자열 선언
		for (int i = 0; i < arr.length; i++) {
			str += arr[i]; // 문자열에 갑 저장
			if(is_prefix.equals(str)) { // 같은지 비교
				answer = 1; // 같다면 1 반환
				break; // 반복문 중지
			}
		}		
        return answer;
    }
}