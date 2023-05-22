class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray(); // 배열에 문자열 한글자씩 저장
        arr[num1] = my_string.charAt(num2); // 해당 인덱스 값 변경
        arr[num2] = my_string.charAt(num1); // 해당 인덱스 값 변경
        answer = String.valueOf(arr); // 배열값 문자열로 변경
        return answer;
    }
}