class Solution {
    public String solution(String code) {
        String answer = "";
        char[] arr = new char[code.length()]; // 비교 하기위한 배열 선언
		arr = code.toCharArray(); // code배열 char값으로 저장
		int idx = 0; // arr의 인덱스 변수
		boolean mode = true; // 모드 1 or 0 나타내는 변수 (true = 0, false = 1)
		while (idx <= code.length() - 1) {
			if (String.valueOf(arr[idx]).equals("1")) { // 만약 문자열 1을 만나면 mode 반전
				mode = !mode;
			} else if (mode == true && idx % 2 == 0) {
				answer = answer + arr[idx]; // mode 가 0 이고 짝수 이면 배열에 저장
			} else if (mode == false && idx % 2 == 1) {
				answer = answer + arr[idx]; // mode 가 1 이고 홀수 이면 배열에 저장
			}
			idx++; // 인덱스 추가
		}
		if (answer == "") {
			answer = "EMPTY"; // 만약 빈문자 열이면 "EMPTY" 출력
		}
        return answer;
    }
}