class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        arr = my_string.split(""); // 배열에 한글자씩 저장
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(letter)) { // letter과 같으면
                arr[i] = ""; // 해당 인덱스를 빈 문자열로 변환
            }
        }
       answer =  String.join("", arr); // 배열값 문자열변수에 저장
        return answer;
    }
}