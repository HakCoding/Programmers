class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        String str = "";
        int indexA = 0; // 첫 2 찾는 변수
		int indexB = 0; // 마지막 2 찾는 변수
		int idx = 0; // 인덱스 변수
		for (int i = 0; i < arr.length; i++) {
			str += arr[i] + " "; // 배열을 문자열로 띄어쓰기 포함 저장
		}
        if(!str.contains("2")) return answer = new int[] {-1}; // 2가 없다면 -1 출력
		String[] strArr = str.split(" "); // 띄어쓰기마다 배열에 저장
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("2")) { // 첫번째 2 찾기
				indexA = i; // 해당 인덱스 저장
				break; // 반복문 정지
			}
		}
		for (int i = strArr.length-1; i > 0; i--) {
			if(strArr[i].equals("2")) { // 마지막 2 찾기
				indexB = i; // 해당 인덱스 저장
				break; // 반복문 정지
			}
		}
		answer = new int[indexB-indexA+1]; // 배열 길이 지정
		for (int i = indexA; i <= indexB; i++) {
			answer[idx] = Integer.parseInt(strArr[i]); // 정수형으로 형 변환 후 배열에 저장
			idx++; // 인덱스 증가
		}
        return answer;
    }
}