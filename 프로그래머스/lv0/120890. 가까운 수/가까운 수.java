class Solution {
    public int solution(int[] array, int n) {
        int[] arr = new int[array.length]; // 배열 서언
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.abs(array[i] - n); // n만큼 뺀 절대값을 배열에 저장
		} 
		int min = arr[0]; // 최솟값 임의로 지정
		int idx = 0; //인덱스 변수
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) { // 최솟값 비교
				min = arr[i]; // 최솟값 저장
				idx = i; // 인덱스 저장
			} else if (min == arr[i]) { // 최솟값과 같다면
				if (array[idx] > array[i]) idx = i; // 해당 인덱스 중 더 작은값 인덱스 저장
			}
		}
		int answer = array[idx]; // 인덱스값 저장
        return answer;
    }
}