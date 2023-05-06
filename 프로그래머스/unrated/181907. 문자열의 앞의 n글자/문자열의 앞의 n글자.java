class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n); // 첫번째 인덱스에서 n번째 인덱스까지 저장
        return answer;
    }
}