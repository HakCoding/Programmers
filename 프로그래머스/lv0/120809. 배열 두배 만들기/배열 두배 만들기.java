class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = (numbers[i]*2); // 각 배열의 인덱스 2배 만들기
        }
        answer = numbers; // 변수에 저장
        return answer;
    }
}