class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2); // 2진수 > 10진수 변환
        int num2 = Integer.parseInt(bin2, 2); // 2진수 > 10진수 변환
        int sum = num1+num2; // 계산
         answer = Integer.toBinaryString(sum); // 정수 > 2진수 변환
        return answer;
    }
}