import java.util.*;
class Solution {
    public String[] solution(String my_string) {
       String[] answer = new String[my_string.length()];
		String[] arr = my_string.split(""); // 한글자씩 배열에 저장
		String str = ""; // 빈 문자열 선언
		for (int i =  arr.length-1; i >= 0; i--) {
			str = arr[i] + str; // 배열값 저장
			answer[i] = str; // 배열에 문자열 저장
		}
		Arrays.sort(answer); // 오름차순 정렬
        return answer;
    }
}