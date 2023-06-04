class Solution {
    public int[] solution(String myString) {       
        String str = myString + "x"; // 마지막에 x 붙이고 변수 선언		
		String[] arr = str.split("x"); // x를 기준으로 배열에 저장
		int[] answer = null;
		if(myString.substring(myString.length()-1).equals("x")) {
			answer = new int[arr.length+1]; // 마지막 문자가 x이면 배열길이 1증가 하여 선언
            
		}
		else { answer = new int[arr.length]; } // 배열 길이 선언
		
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i].length(); // 배열의 인덱스 값의 길이 저장
		}
        return answer;
    }
}