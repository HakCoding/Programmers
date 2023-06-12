class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int check = 0; // 체크 변수
		for (int i = 0; i < dic.length; i++) {
				check = 0; // 변수 초기화
			for (int j = 0; j < spell.length; j++) {
				if (dic[i].contains(spell[j])) { // 비교문자를 포함하면
					check++; // 변수 증가
				}
			}
			if (check == spell.length) { // 비교문자의 길이와 같으면
				answer = 1; 
				break;
			}
		}
        return answer;
    }
}