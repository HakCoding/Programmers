class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split(""); // 한글자씩 배열에 저장
        
        for(int i=0; i< arr.length; i++){
            if((i+1) % code == 0){ // code의 배수 인덱스인지 판단
                answer += arr[i]; // 변수에 저장
            }
        }
        return answer;
    }
}