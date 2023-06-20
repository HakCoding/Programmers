class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String str = "";
		for (int i = 0; i < my_string.length(); i = i +m) {
			str +=my_string.substring(i, m+i) + " ";
		}
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i].substring(c-1,c);
		}
        return answer;
    }
}