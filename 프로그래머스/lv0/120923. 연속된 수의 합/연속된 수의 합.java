class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num]; // 배열 길이 선언
        int start;
        start= (total/num) - ((num - 1)/2); // 배열의 최솟값 구하기
        
        for(int i = 0; i < num; i++) {
             answer[i] = start; // 배열 값 넣기
             start++; // 변수 증가
        }        
        return answer;
    }
}