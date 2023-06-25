class Solution {
    public int[] solution(int[] arr) {
        StringBuffer str = new StringBuffer(""); // 문자열 Buffer 선언			
		for (int i = 0; i < arr.length; i++) {
			if(str.toString().equals("")) str = str.append(arr[i]); // 빈 무자열이면 해당 문자열 저장
			else if(!str.toString().equals("") && str.toString().substring(str.length()-1).equals(String.valueOf(arr[i]))) { 
				str.deleteCharAt(str.length()-1); // 조건에 맞는 문자열 지우기
			}
			else if(!str.toString().equals("") && !str.toString().substring(str.length()-1).equals(String.valueOf(arr[i]))) {
				str.append(arr[i]); // 조건에 맞는 문자열 저장
			}
		}
		int[] answer = new int[str.length()]; // 배열 길이 선언
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(str.toString().substring(i,i+1)); // 배열에 해당 인덱스값 저장
		}
        if(answer.length == 0) answer = new int[] {-1}; // 빈 배열이면 -1 저장
        return answer;
    }
}