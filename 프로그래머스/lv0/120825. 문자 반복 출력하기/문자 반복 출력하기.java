class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = new String[my_string.length()]; // 배열 선언
        arr = my_string.split(""); // 문자열 변수에 저장
        for (int i = 0; i < my_string.length(); i++) {
			answer = answer + arr[i].repeat(n); // n 만큼 반복하여 저장
		}
        return answer;
    }
}