class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
       	char[] arr = new char[my_string.length()];
		arr = my_string.toCharArray();

		for (int i = 0; i < my_string.length(); i++) {
			if (i == s) {
				i = i + overwrite_string.length();
				answer = answer + overwrite_string;
				if(i == my_string.length()) {
					break;
				}
			}			
			answer = answer + arr[i];
		}
        return answer;
    }
}