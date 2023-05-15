import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);	// 오름차순 정렬
		answer = array[array.length/2]; // 중앙값 저장
        return answer;        
    }
}