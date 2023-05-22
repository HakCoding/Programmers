class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200]; // 배열 선언
        for (int[] i : lines) {
            for (int j = (i[0] + 100); j < (i[1] + 100); j++) {
                arr[j]++;
            }
        }       
        for (int i : arr) {
            if (i > 1) answer++;
        }
        return answer;
    }
}