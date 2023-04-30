class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        my_string = my_string.replaceAll("\\s+", " "); // 공백을 1개 남기고 모두 제거
		my_string = my_string.trim(); // 처음과 마지막 공백 제거
		answer = my_string.split(" "); // 공백을 기준으로 배열에 저장
        return answer;
    }
}