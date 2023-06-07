import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String str = ""; //빈 문자열	
		for (int i = 0; i < flag.length; i++) {
			if(flag[i]) { // true 이면
				for (int j = 0; j < arr[i]*2; j++) {
					str += arr[i]; // 인덱스 값의 2배를 문자열에 저장
				}
			}		
			else {
					str = str.substring(0, str.length()-arr[i]); // 아니면 인덱스 값만큼 빼기
				}
			}	
		String[] strArr = str.split(""); // 한글자씩 배열에 저장
		int answer[] = Arrays.asList(strArr).stream().mapToInt(Integer::parseInt).toArray();		
        // 문자열 배열 정수 배열로 변환
        return answer;
    }
}