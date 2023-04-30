class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n-1)] ;
        int idx = 0;
        for (int i = n-1; i < num_list.length; i++) {
			answer[idx] = num_list[i];
			idx++; // for문을 n-1 번부터 돌려 배열에 저장
		}				
        return answer;
    }
}