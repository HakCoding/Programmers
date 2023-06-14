class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = ""; 
        for(int i = 0; i<my_strings.length; i++){
            String str = my_strings[i]; // 뽑아낼 문자열 인덱스 변수에 저장
            answer += str.substring(parts[i][0], parts[i][1]+1); // 조건에 맞는 배열값 문자열에 저장
        }
        return answer;
    }
}