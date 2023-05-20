class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] array = s.split(" "); // 공백마다 배열에 저장
        for (int i=0; i<array.length; i++) {
            if (array[i].equals("Z")) { // 인덱스가 Z이면
                array[i-1] = "0"; // Z 앞의 인덱스를 0으로 변환
                array[i] = "0"; // Z 인덱스를 0으로 변환
            }
        }
        for (int i=0; i<array.length; i++) {
            answer += Integer.parseInt(array[i]); // 배열속 값들 더하기
        }
        return answer;
    }
}