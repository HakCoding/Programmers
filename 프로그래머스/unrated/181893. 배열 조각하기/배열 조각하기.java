import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
       for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) { // 짝수이면
                arr = Arrays.copyOfRange(arr, 0, query[i]+1); // 해당 인덱스 배열 복사
            } 
            else { // 홀수 이면
                arr = Arrays.copyOfRange(arr, query[i], arr.length); // 해당 인덱스 배열 복사
            }
        }
		int[] answer = arr; // 배열값 복사
        return answer;
    }
}