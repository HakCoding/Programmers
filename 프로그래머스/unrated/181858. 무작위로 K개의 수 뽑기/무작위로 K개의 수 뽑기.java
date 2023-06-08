import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // 리스트 선언
		int[] answer = new int[k]; // 배열 길이 지정
		int count = 0; // 카운터 변수
		list.add(arr[0]); // 리스트 0번 지정
		
		for (int i = 0; i < arr.length; i++) {
			count = 0; // 카운터 초기화
			for (int j = 0; j < list.size(); j++) {
				if(arr[i] == list.get(j)) { // list에 있는 숫자인지 판단
					count++; // 카운터 증가
				}
			}
			if(count == 0) { list.add(arr[i]); } // 카운터가 0 이면 리스트 추가
		}		
		for (int i = 0; i < 1000; i++) { list.add(-1); } // 빈칸 -1로 채우기
		for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); } // 배열에 저장
        return answer;
    }
}