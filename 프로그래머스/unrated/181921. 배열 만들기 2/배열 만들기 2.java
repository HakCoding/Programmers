import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>(); // 리스트 선언
		for (int i = l; i <= r; i++) {
			String str = String.valueOf(i); // 문자열 형식으로 저장
			int num = 0; // 필요숫자 여부 판단 변수
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '0' || str.charAt(j) == '5') { // 0 or 5가 있다면
					num++; // 변수 증가
				}
			}
			if (num == str.length()) { // 원소에 0 or 5 뿐이라면
				list.add(i); // 리스트에 추가
			}
		}
		if (list.size() == 0) // 리스트가 비었으면
			answer = new int[] { -1 }; // 배열에 -1 저장
		else answer = list.stream().mapToInt(i -> i).toArray(); // 리스트를 정수형 배열로 변환
        return answer;
    }
}