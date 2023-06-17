#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
double solution(int numbers[], size_t numbers_len) {
    double answer = 0;
        double sum = 0;
		for (int i = 0; i < numbers_len; i++) {
			sum = sum + numbers[i];
		}   // 배열의 값을 모두 더한다
		answer = sum / numbers_len; // 총합을 배열의 길이 만큼 나눈다
        
        return answer;
}