class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0]; // x 축 최솟값
		int x2 = dots[0][0]; // x 축 최댓값
		int y1 = dots[0][1]; // y 축 최솟값
		int y2 = dots[0][1]; // y 축 최댓값
		for (int i = 0; i < dots.length; i++) {
			x1 = Math.min(x1, dots[i][0]); // x 최솟값 계산
			x2 = Math.max(x2, dots[i][0]); // x 최댓값 계산
			y1 = Math.min(y1, dots[i][1]); // y 최솟값 계산
			y2 = Math.max(y2, dots[i][1]); // y 최댓값 계산
		}
		answer = (x2 - x1) * (y2 - y1); // 직사각형 넓이 계산
        return answer;
    }
}