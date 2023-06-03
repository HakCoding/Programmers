import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
       int[] arr2 = null; // 비교 배열 선언		
		while(!Arrays.equals(arr, arr2)) { // 두배열이 다르면 반복문 시작			
			arr2 = Arrays.copyOf(arr, arr.length); // 배열 복사
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] >= 50 && arr[i]%2 ==0) arr[i] = arr[i] / 2; 
                // 50 이상이고 짝수면 나누기 2 하고 배열에 저장
				else if(arr[i] < 50 && arr[i]%2 != 0) arr[i] = (arr[i] * 2) + 1;	
                // 50보다 미만이고 홀수면 곱하기 2후 더하기 1 한 후에 배열에 저장
			} answer++; // 카운터 증가
		}
        return answer-1;
    }
}