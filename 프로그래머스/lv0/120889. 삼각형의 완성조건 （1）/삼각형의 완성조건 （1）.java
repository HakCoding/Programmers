import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides); // 배열 정렬    
        if(sides[2] < (sides[0] + sides[1])) { // 삼각형의 조건 확인
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}