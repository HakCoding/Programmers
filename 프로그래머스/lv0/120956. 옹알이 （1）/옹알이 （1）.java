class Solution {
    public int solution(String[] babbling) {
       int answer = 0;
       int len = 0;
       String[] arr = {"aya", "ye", "woo", "ma"};        
       for(int i = 0; i < babbling.length; i++) {
            len = 0;
            for(int j = 0; j < 4; j++) { 
                if(babbling[i].contains(arr[j])) { // 문자열 포함 확인
                    len += arr[j].length(); // 문자열 길이 저장
                }
            }           
            if (len == babbling[i].length()) // 문자들의 길이의 합과 같으면 
                answer++; // 변수 증가
        }
        return answer;
    }
}