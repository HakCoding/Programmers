class Solution {
    public String solution(int age) {
        String answer = "";
        String[] arr = Integer.toString(age).split(""); // 숫자 한자리씩 배열에 저장	
		for(int i=0; i<arr.length; i++){
            answer = answer + (char)(Integer.parseInt(arr[i])+97); // 아스키 값 계산
        }
        return answer;
    }
}