#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    int answer = 2; // 직각
    if(angle == 180) answer = 4; // 평각        
    else if(angle < 90) answer = 1; // 예각
    else if(angle > 90) answer = 3; // 둔각
    return answer;
}