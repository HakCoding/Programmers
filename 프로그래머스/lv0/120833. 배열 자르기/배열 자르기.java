class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2-num1)+1];
        int idx = 0; // 배열 인덱스
        for(int i=num1; i<=num2; i++){ // num1부터 num2 까지
            answer[idx] = numbers[i]; // 값 저장
            idx++; // 인덱스 증가
        }
        return answer;
    }
}