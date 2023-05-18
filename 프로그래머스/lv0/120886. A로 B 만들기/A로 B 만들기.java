import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforechr = before.toCharArray(); // before값 한글자씩 저장
        char[] afterchr = after.toCharArray(); // after값 한글자씩 저장
        
        Arrays.sort(beforechr); // beforechr 정렬
        Arrays.sort(afterchr); // afterchr 정렬
        
        before = new String(beforechr); // 문자열로 변환
        after = new String(afterchr); // 문자열로 변환
        
        answer = before.equals(after) ? 1 : 0; // 삼항 연산
        
        return answer;
    }
}