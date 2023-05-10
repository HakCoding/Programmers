class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", 
                          "..-.", "--.", "....", "..", ".---", 
                          "-.-", ".-..", "--", "-.", "---", 
                          ".--.", "--.-", ".-.", "...", "-", 
                          "..-", "...-", ".--", "-..-", "-.--", "--.." }; // 모스부호
		String[] arr = letter.split(" "); // 배열에 하나씩 저장
		for (String i : arr) {
			for (int j = 0; j < morse.length; j++) {
				if (morse[j].equals(i)) { // 비교하여 같으면
					answer = answer + (char) (j + 97); // 아스키값 계산하여 저장
				}
			}
		}
        return answer;
    }
}