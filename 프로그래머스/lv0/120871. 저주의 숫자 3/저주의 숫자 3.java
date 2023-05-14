class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1; //카운트 변수
        while (count <= n) {
           
            if ((count % 3 == 0) || String.valueOf(count).contains("3")) { 
                n++; // 3의 배수 이거나 문자에 3이 포함되어 있는지 확인후 값 증가
               
            }    
             count++; // 카운트 증가
        }
        answer = n;
        return answer;
    }
}