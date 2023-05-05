class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer = (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
        // 장군개미 공격 + 뒷 단위를 병정개미 공격 + 그러고 남은 hp 일개미 공격
        return answer;
    }
}