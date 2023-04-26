class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] arr = new char[number.length()];		
		arr = number.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			answer = answer + (int)arr[i] - '0';
		}
		answer = answer % 9;      
        return answer;
    }
}