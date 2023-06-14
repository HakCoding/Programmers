import java.util.*;
class Solution {
    public int[] solution(int[] arr) {       
        ArrayList<Integer> list = new ArrayList<Integer>(); // 리스트 선언
		int i = 0; // 인덱스 변수
		while(i < arr.length) {	
			if (list.size() == 0) { // 리스트가 비었으면
				list.add(arr[i]); // 배열값을 리스트에 추가
				i++; // 인덱스 증가
			}
			else if (list.get(list.size() - 1) < arr[i]) { //조건이 참이면
				list.add(arr[i]); // 리스트 추가
				i++; // 인덱스 증가
			} 
			else if (list.get(list.size() - 1) >= arr[i]) { // 조건이 참이면
				list.remove(list.size() - 1); // 리스트 마지막 원소 제거
			}
		}
        int[] stk = new int[list.size()]; // 배열 길이 선언
		for (int j = 0; j < stk.length; j++) {
			stk[j] = list.get(j); // 배열에 리스트값 저장
		}            
        return stk;
    }
}