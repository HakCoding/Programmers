class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String strA = "";
		String strB = "";
        for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 != 0) {
				strA = strA + String.valueOf(num_list[i]);
			} 
			else {
				strB = strB + String.valueOf(num_list[i]);
			}
		}
        answer = Integer.parseInt(strA) + Integer.parseInt(strB);
        return answer;
    }
}