import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) {
				answer = Arrays.copyOfRange(str_list,0,i); // 조건에 맞는 배열 복사
				break; // 반복문 중지
			}
			else if (str_list[i].equals("r")) {				
                answer = Arrays.copyOfRange(str_list,i+1,str_list.length); // 조건에 맞는 배열 복사
                break; // 반복문 중지				
			}				
		}	
        return answer;
    }
}