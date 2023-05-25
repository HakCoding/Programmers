class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = new String[num_str.length()];		
		arr = num_str.split(""); // 한글자씩 배열에 저장 
		for (int i = 0; i < arr.length; i++) {
			answer = answer + Integer.parseInt(arr[i]); // 형태변환 후 계산
		}
        return answer;
    }
}