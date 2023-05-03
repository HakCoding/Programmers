import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer;       
		int a = 0;
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i * j == n) {
					arr[a] = i;
					a++;
				}
			}
		}		
		answer = new int[a];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
		}
        return answer;
    }
}