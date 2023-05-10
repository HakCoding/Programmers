class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        answer = numbers[2 * (k - 1) % numbers.length]; // 공을 던진 사람
        return answer;
    }
}