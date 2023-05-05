class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.split("")[i].equals("0")){
                answer = answer + "5"; // 묵이면 보 저장
            }
            else if(rsp.split("")[i].equals("2")){
                answer = answer + "0"; // 찌면 묵 저장
            }
            else answer = answer + "2"; // 아니면 가위 저장
        }
        return answer;
    }
}