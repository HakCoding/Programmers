class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = A;

        for (int i = 0; i < A.length(); i++) {
            if (str.equals(B)) { // A 와 B 가 같은지 비교
                return answer; 
            }
            String str2 = str.substring(str.length() - 1); // 마지막 문자만 저장
            str = str2 + str.substring(0, str.length() - 1); // 마지막 문자가 제일 앞으로 오고 나마지 저장
            answer++; // 변수 증가
        }
        answer = -1;
        return answer;
    }
}