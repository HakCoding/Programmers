class Solution {
    public String[] solution(String myStr) {
        if(myStr.contains("a"))myStr = myStr.replaceAll("a", " "); // a를 공백으로 처리
		if(myStr.contains("b"))myStr = myStr.replaceAll("b", " "); // b를 공백으로 처리
		if(myStr.contains("c"))myStr = myStr.replaceAll("c", " "); // c를 공백으로 처리
		for (int i = 0; i < 10; i++) {
			if (myStr.contains("  ")) { // 공백이 2칸이 있다면
				myStr = myStr.replace("  ", " "); // 공백 2칸을 1칸으로 바꾼다
			}
		}
		myStr = myStr.trim(); // 처음과 마지막 공백 제거
		String[] answer = myStr.split(" "); // 공백마다 배열에 저장
		if(answer[0].equals("")) answer[0] = "EMPTY"; // 배열이 비었으면 EMPTY 넣기
        return answer;
    }
}