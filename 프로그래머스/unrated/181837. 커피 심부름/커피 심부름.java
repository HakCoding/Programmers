class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String a : order) {
            if(a.contains("cafelatte")) { // 메뉴 확인
                answer+=5000; // 카페 라테면 + 5000
            } 
            else {
                answer+=4500; // 아니면 +4500
            }
        }
        return answer;
    }
}