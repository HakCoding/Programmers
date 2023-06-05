class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] arr = my_string.split(""); // 한글자씩 배열에 저장
		for (int i = 0; i < index_list.length; i++) {
			answer += arr[index_list[i]]; // 해당 인덱스의 문자값 저장
		}
        return answer;
    }
}