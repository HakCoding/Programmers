import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {       
        int[] answer = new int[emergency.length];
		int[] asc = new int[emergency.length];
		
		for (int i = 0; i <= emergency.length - 1; i++) {
			asc[i] = emergency[i];	// 배열에 저장
		}

		Arrays.sort(asc); // 배열 오름차순 정렬

		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (asc[i] == emergency[j]) { // emergency 와 같다면
					answer[j] = emergency.length - i; // 배열에 저장
				}
			}
		}
        return answer;
    }
}