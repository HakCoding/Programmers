class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++)
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(j % queries[i][2] == 0) // 배수인지 확인
                    arr[j]++; // 해당 인덱스 값 증가
        }
        int[] answer = arr; // 배열 복사
        return answer;
    }
}