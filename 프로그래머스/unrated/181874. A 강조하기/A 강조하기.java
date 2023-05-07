class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase(); // 모두 소문자로 변환
		answer = myString.replaceAll("a", "A"); // a -> A 로 변환
        return answer;
    }
}