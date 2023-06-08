import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] arr = new String[my_string.length()]; // 배열 길이 서넝ㄴ
		String[] strArr = my_string.split(""); // 한글자씩 배열에 저장
		String str = ""; // 빈 문자열 선언
		for (int i =  strArr.length-1; i >= 0; i--) {
			str = strArr[i] + str; // 배열값 저장
			arr[i] = str; // 배열에 문자열 저장
		}
		Arrays.sort(arr); // 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(is_suffix)) { // 접미사가 포함되었는지 판단
				answer = 1; // 참이면 1
				break; // 반복문 정지
			}
		}
        return answer;
    }
}