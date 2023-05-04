class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
         if(num_list.length < 11) answer = 1; // 길이가 11 이상이면 더하기 해야되서 0으로 변환
		 for (int i = 0; i < num_list.length; i++) {			 
			answer = num_list.length < 11 ? answer * num_list[i] : answer + num_list[i] ;
		}
        return answer;
    }
}