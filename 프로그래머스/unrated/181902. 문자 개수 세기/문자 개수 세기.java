class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray(); // 한글자씩 배열에 저장
		int[] answer = new int[26 * 2]; // 알파벳 수 *2 만큼 배열길이 선언
		for (int i = 0; i < arr.length; i++) {
			for (char c = 'a'; c <= 'z'; c++) { // 소문자인지 판단
				if (arr[i] == c) { answer[26 + (int) c - 97]++; } // 해당위치 인덱스 증가
			}
			for (char c = 'A'; c <= 'Z'; c++) { // 대문자인지 판단
				if (arr[i] == c) { answer[(int) c - 65]++; } // 해당위치 인덱스 증가
			}
		}
        return answer;
    }
}