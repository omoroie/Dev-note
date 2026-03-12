#include <stdio.h>

int main() {
    int x = 7, y = 4, z;

    // 1단계: 삼항 연산자
    z = y % 3 < 3 ? 2 : 1;
    printf("%d\n", z);
    
    // 2단계: 비트 AND 및 시프트 연산
    z = z & z >> 1;
    printf("%d\n", z);
    
    // 3단계: 논리 연산 및 삼항 연산
    z = x > 5 && z <= 3 ? z * x : z / x;
    printf("%d", z);
    return 0;
}
