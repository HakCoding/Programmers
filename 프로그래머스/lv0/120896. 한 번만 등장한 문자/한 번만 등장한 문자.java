import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int indexA = 0; // 첫 인덱스 변수
		int indexB = 0; // 마지막 인덱스 변수
		String[] arr = s.split(""); // 한글자씩 배열에 저장
		Arrays.sort(arr);// 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			indexA = s.indexOf(arr[i]); // 중복 문자 첫 인덱스 찾기
			indexB = s.lastIndexOf(arr[i]); // 중복 문자 마지막 인덱스 찾기
			if(indexA == indexB) answer += arr[i]; // 익덱스가 같다면 문자열 저장
		}
        return answer;
    }
}