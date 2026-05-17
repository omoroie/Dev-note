#include <stdio.h>

int isPerfectNumber(int number) {
    int divisor, divisorSum = 0;

    for (divisor = 1; divisor <= number/2 ; divisor++) {
        if (number % divisor == 0)
            divisorSum += divisor;
    }

    if (number == divisorSum)
        return 1; // 완전수
    return 0;   // 완전수가 아님
}

int main() {
    int num, totalSum = 0;

    for (num = 2; num <= 100; num++) {
        if (isPerfectNumber(num))
            totalSum += num;
    }

    printf("%d\n", totalSum);
    return 0;
}