import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length % n == 0 ? num_list.length / n : num_list.length/n +1; 
        // 배열 길이 계산
		int[] answer = new int[len]; // 길이 지정
		int idx = 0; // 인덱스 변수
		for (int i = 0; i < num_list.length; i= i+n) {
			answer[idx] = num_list[i]; // 배열값 저장
			idx++; // 인덱스 증가
		}
        return answer;
    }
}