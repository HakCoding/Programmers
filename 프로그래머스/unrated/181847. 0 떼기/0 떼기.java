class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] arr  = n_str.split("");
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("0")) {
				for (int j = i; j < arr.length; j++) {
					answer += arr[j];
				}		
				return answer;
			}			
		}
        return answer;
    }
}