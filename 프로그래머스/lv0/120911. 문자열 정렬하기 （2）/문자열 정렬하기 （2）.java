import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase(); // 소만자 변환
		char[] arr = my_string.toCharArray(); // char 배열에 한글자씩 저장
		Arrays.sort(arr); // 오름차순 정렬
		answer = new String(arr); // answer에 저장
        return answer;
    }
}