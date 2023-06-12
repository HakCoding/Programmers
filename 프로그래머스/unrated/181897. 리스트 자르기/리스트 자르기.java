import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        String str = ""; // 문자열 선언
		String[] strArr = null; // 빈 문자열 배열 선언
		if(n == 1) {
			answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1); // 1번 조건에 맞는 배열 복사
		}
		if(n == 2) {
			answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length); // 2번 조건에 맞는 배열 복사
		}
		if(n == 3) {
			answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1); // 3번 조건에 맞는 배열 복사
		}
		if(n == 4) {
			for (int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]) {
				str += num_list[i] + " "; // 4번 조건에 맞는 인덱스값 문자열로 저장
			}
			strArr = str.split(" "); // 띄어쓰기 마다 배열에 저장
			answer = Arrays.asList(strArr).parallelStream().mapToInt(Integer::parseInt).toArray(); // 문자열 배열 정수배열로 변환
		}
        return answer;
    }
}