import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toUpperCase();
		for (char i = 'A'; i <= 'Z'; i++) {
			my_string = my_string.replace(i, ' '); // 숫자 이외의 글자 지우기
		}
		for (int i = 0; i < 1000; i++) {
			my_string = my_string.replaceAll("  ", " "); // 두번 뛰어진거 없애기		
		}
		String[] arr = my_string.split(" "); // 띄어쓰기마다 배열에 저장
		System.out.println(Arrays.toString(arr));		
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) { // 빈문자열이 아니면
				answer += Integer.parseInt(arr[i]); // 정수로 변환후 계산하여 저장
			}
		}
        return answer;
    }
}