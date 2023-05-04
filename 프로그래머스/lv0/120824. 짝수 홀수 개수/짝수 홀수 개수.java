class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0, even = 0; // 짝수, 홀수 변수
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) { // 짝수이면
                even++; // 짝수 변수 증가
            }
            else { // 홀수이면
                odd++; // 홀수 증가
            }
        }
        answer[0] = even; // 짝수 갯수 저장
        answer[1] = odd; // 홀수 갯수 저장
        return answer;
    }
}