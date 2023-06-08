import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = ""; 
		Map<String, String> hashMap = new HashMap<String, String>(); // hashMap 선언
		for (String[] s : db) {
			hashMap.put(s[0], s[1]); // db값 배열에 저장
		}
		if (hashMap.containsKey(id_pw[0])) {
			if (hashMap.get(id_pw[0]).equals(id_pw[1])) { // id_pw와 비교
				answer = "login"; // 문자열 저장
			} 
			else { answer = "wrong pw"; } // 문자열 저장 
		} 
		else { answer = "fail"; } // 문자열 저장
        return answer;
    }
}