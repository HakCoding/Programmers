import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" "); // 공백 기준으로 배열에 저장
        answer = answer + Integer.parseInt(arr[0]); // 배열 0번째 인덱스값 저장
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i].equals("+")) { // + 이면
				answer = answer + Integer.parseInt(arr[i + 1]); // 변수에 계산
			}
			else if(arr[i].equals("-")) { // - 이면
				answer = answer - Integer.parseInt(arr[i + 1]); // 변수에 계산
			}
		}				
        

		
        return answer;
    }
}