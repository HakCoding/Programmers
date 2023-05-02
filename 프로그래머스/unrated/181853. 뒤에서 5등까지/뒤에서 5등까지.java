import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list); // 오름차순으로 정렬
		for (int i = 0; i < answer.length; i++) answer[i] = num_list[i];
            // 배열의 0번째 값부터 answer 크기만큼 저장
        return answer;
    }
}