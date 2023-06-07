class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] arr = code.split(""); // 한글자씩 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			if(i % q == r) answer += arr[i]; // 나머지가 r 이면 문장열로 저장
		}
        return answer;
    }
}