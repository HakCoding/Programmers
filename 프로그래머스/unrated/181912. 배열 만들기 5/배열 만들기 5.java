import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<Integer>();	// 리스트 선언	
		int[] arr = new int[intStrs.length]; // 배열 선언
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(intStrs[i].substring(s, s+l)); // 배열에 정수형으로 저장
		}		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > k) list.add(arr[i]); // 조건에 맞는 값 리스트에 저장
		}
		int[] answer = new int[list.size()]; // 배열 길이 지정
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i); // 리스트 원소 배열에 저장
		}
        return answer;
    }
}