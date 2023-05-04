class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int idx = num_list.length-1; // 배열의 마지막 인덱스 저장 
        for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[idx--]; // 마지막 인덱스 값 저장후 감소			
		}        
        return answer;
    }
}