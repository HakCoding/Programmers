class Solution {
    public int[] solution(int[][] score) {
        int[]  answer = new int[score.length];
        float[] average = new float[score.length];
        for(int i = 0; i < score.length; i++) {
            average[i] = (float)((score[i][0] + score[i][1]) / 2.0); // 각 인덱스의 평균 규하기
        }    
        for(int i = 0; i < score.length; i++) {
            int count = 1; // 등수 지정 변수
            for(int j = 0; j < score.length; j++) {
                if(average[i] < average[j]) count++; // count 증가
                answer[i] = count; // count 저장
            }
        }
        
        return answer;
    }
}