class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int z = i; z <= j; z++){
           str = Integer.toString(z); // 비교 변수 선언
            for(int y = 0; y < str.length(); y++){
                if(Integer.toString(k).equals(str.substring(y,y+1))){ // 포함 유무 확인
                    answer++; // 참이면 변수 증가
                }
            }
        }        
        return answer;
    }
}