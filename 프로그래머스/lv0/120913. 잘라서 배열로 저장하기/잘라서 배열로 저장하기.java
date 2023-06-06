class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n; //모자란 길이 계산
		String str = ""; // 빈문자열
		int m = 0;
        if(len != 0) {
            for (int i = 0; i < n-len; i++) {
                str += "?"; // 모자란 길이 만큼 ? 표 증가
            }
        }
		my_str += str; // 모자란 길이 ?로 채우기
		String[] answer = new String[my_str.length()/n];
		for (int i = 0; i < my_str.length()/n; i++) {
			answer[i] = my_str.substring(m,m+n); // n 갯수만큼 배열에 담기
			m +=n;
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i]= answer[i].replaceAll("[?]", ""); // ? 없애기
		}
        return answer;
    }
}