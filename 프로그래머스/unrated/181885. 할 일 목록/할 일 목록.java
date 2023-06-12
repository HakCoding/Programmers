class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = ""; // 빈문자열 선언
		for (int i = 0; i < finished.length; i++) {
			if(finished[i] == false) str += todo_list[i] + " "; // false면 문자열 추가후 띄어쓰기 한칸
		}
		String[] answer = str.split(" "); // 띄어쓰기 기준으로 배열에 저장
        return answer;
    }
}