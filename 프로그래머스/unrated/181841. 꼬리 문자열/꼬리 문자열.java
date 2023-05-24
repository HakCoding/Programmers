class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i<str_list.length; i++){
            if(str_list[i].contains(ex) == false){ // 포함 여부 확인
                answer+=str_list[i]; // 없으면 변수에 저장
            }
        }
        return answer;
    }
}