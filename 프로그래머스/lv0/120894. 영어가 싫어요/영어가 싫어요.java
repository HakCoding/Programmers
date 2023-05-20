class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        numbers = numbers.replace("zero", "0"); // 0으로변환
        numbers = numbers.replace("one", "1"); // 1으로변환
        numbers = numbers.replace("two", "2"); // 2으로변환
        numbers = numbers.replace("three", "3"); // 3으로변환
        numbers = numbers.replace("four", "4"); // 4으로변환
        numbers = numbers.replace("five", "5"); // 5으로변환
        numbers = numbers.replace("six", "6"); // 6으로변환
        numbers = numbers.replace("seven", "7"); // 7으로변환
        numbers = numbers.replace("eight", "8"); // 8으로변환
        numbers = numbers.replace("nine", "9");// 9으로변환
        answer = Long.parseLong(numbers); // return 값이 long
        return answer;
    }
}