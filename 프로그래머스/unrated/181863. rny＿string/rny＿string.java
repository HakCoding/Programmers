class Solution {
    public String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replaceAll("m", "rn"); // 모든 문자 변환
        return answer;
    }
}