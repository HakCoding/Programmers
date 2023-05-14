class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){ // 문자열에 i 번째 인덱스와 같은 문자가 없으면
                answer = answer + my_string.charAt(i); // 변수에 저장
            }
        }
        return answer;
    }
}