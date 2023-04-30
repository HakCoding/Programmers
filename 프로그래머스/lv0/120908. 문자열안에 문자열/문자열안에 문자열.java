class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer = str1.contains(str2) == true ? 1 : 2; // 문자를 포함하면 1 아니면 2
        return answer;
    }
}