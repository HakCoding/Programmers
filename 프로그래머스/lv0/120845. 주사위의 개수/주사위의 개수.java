class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int width, length, heigth;
        width = box[0]/n; // 가로 값 구하기
        length = box[1]/n; // 세로 값 구하기
        heigth = box[2]/n; // 높이 값 구하기
        answer = width * length * heigth; // 가로 * 세로 * 높이
        return answer;
    }
}