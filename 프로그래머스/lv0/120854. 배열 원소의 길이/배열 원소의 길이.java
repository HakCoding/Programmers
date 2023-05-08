class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int len = strlist.length; // 배열의 길이
        for(int i = 0; i<len; i++){
            answer[i] = strlist[i].length(); // 각 배열의 인덱스의 길이
        }        
        return answer;
    }
}