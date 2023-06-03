class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] arr = my_string.split(""); // 한글자씩 배열에 저장
		for (int i = 0; i <s; i++) answer += arr[i]; // s전 문자저장
		for (int i = e; i >= s; i--) answer += arr[i]; // s ~ e 까지 문자저장
		for (int i = e+1; i < arr.length; i++) answer += arr[i]; // e이후 문자 저장
        return answer;
    }
}