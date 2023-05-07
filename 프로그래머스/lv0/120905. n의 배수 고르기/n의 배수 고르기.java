class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int[] arr = new int[numlist.length]; // 임시 저장 배열
        int count = 0; // arr 인덱스 변수
        for(int i = 0; i<numlist.length; i++){
            if( numlist[i]%n == 0){ // n의 배수인지 판별
                arr[count] = numlist[i]; // 배수이면 배열에 값 저장
                count++; // 인덱스 증가
            }
        }
        
        answer = new int[count];
        for(int i = 0; i<count; i++){
            answer[i] = arr[i]; // answer에 배수값 이동
        }
        return answer;
    }
}