class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
			while (num_list[i] != 1) {
				num_list[i] = num_list[i] % 2 == 1 ? // 배열 값이 홀수 인지 짝수인지 판단
                    (num_list[i] - 1) / 2 : num_list[i] / 2; // 홀수면 앞쪽 짝수면 뒤쪽 수행
				answer++;
			}
		}
        return answer;
    }
}