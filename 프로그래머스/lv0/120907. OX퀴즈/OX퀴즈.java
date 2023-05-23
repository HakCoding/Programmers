class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" "); // 띄어쓰기 마다 배열에 저장
            if (arr[1].equals("+")) { // 부호가 + 이면
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O"; // 정수로 변한 후 계산식이 맞는지 확인
                } else {
                    answer[i] = "X"; 
                }
            } else if (arr[1].equals("-")) { // 부호가 - 이면
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O"; // 정수로 변한 후 계산식이 맞는지 확인
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}