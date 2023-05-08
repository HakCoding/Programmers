class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] arr = {"a", "e", "i", "o", "u"}; // 모음 저장      
        for (String s : arr) {
            answer = answer.replaceAll(s, ""); // 모음 제거
        }
        return answer;
    }
}