class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) answer[i] = num_list[i];
        // 0 번째 인덱스 부터 n번째 까지 저장
        return answer;
    }
}