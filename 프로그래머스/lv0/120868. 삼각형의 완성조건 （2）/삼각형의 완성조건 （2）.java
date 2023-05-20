import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int min = sides[0]; // 최소 길이
        int max = sides[1]; // 최대 길이
        for(int i = max-min+1; i <= max; i++){ // 주어진 길이가 가장긴 변일때
            answer++;
        }
        for(int i = max+1 ; i < max+min; i++){ // 3번째 길이가 가장 긴 변일때
            answer++;
        }
        return answer;
    }
}