import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String[] arr = my_string.split(""); // 한글자씩 배열에 저장
		String str = ""; // 빈문자열
		for (int i = 0; i < my_string.length(); i++) { // 비교 대상
			for (int j = 0; j < 10; j++) { // 배교 값
				if (arr[i].equals(String.valueOf(j))) { // 숫자인지 판단
					str += arr[i]; // 숫자면 문자열로 저장
				}
			}
		}
		arr = str.split(""); // 배열에 한글자식 저장
		Arrays.sort(arr); // 오름차순 정렬
		answer = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();// 문자열 배열 정수 배열로 변환
        return answer;
    }
}