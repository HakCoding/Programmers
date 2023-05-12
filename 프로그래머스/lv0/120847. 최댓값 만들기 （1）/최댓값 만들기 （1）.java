import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 배열 오름차순 정렬
		answer = numbers[numbers.length-1] * numbers[numbers.length-2]; // 마지막 과 그전 인덱스 곱하기
        return answer;
    }
}