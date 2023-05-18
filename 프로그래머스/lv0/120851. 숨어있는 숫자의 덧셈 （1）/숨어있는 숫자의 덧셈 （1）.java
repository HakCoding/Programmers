class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();  //문자열을 한 글자씩 저장
        String str = "";
        
       
        for(int i=0; i<ch.length; i++){
            if(49<=ch[i] && ch[i]<=57){ // 아스키 값으로 숫자인 문자만 저장
                str += ch[i];
            }
        }        
            
        String[] str_arr = str.split(""); // str문자열을 answer에 저장
        for(int i=0; i<str_arr.length; i++){
            answer += Integer.parseInt(str_arr[i]); // 정수로 변한 후 계산
        }
        return answer;
    }
}