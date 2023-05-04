class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer buf = new StringBuffer(my_string); // 문자열 변수에 담기
		answer = buf.reverse().toString(); // 문자열 뒤집어서 변수에 담기        
        return answer;
    }
}