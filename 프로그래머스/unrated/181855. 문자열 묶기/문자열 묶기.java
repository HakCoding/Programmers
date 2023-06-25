import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] num = new int[strArr.length]; // 카운터 배열 길이 선언
		for (int i = 0; i < strArr.length; i++) {
			num[strArr[i].length()]++; // 해당 인덱스의 길이에 해당하는 값 증가
		}		
		int answer = num[0];
		for (int i = 0; i < num.length; i++) {
			if(answer < num[i]) answer = num[i]; // 가장 큰 인덱스 계산하여 저장
		}
        return answer;
    }
}