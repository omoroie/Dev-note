#include <stdio.h>
void func(char* d, char *s) {
    while (*s){
        *d = *s;
        d++; s++;
    }
    *d = '\0';
}

int main() {
    char* str1 = "first";
    char str2[50] = "teststring";
    int result = 0;
    func(str2, str1);
    for (int i=0; str2[i] !='\0';i++) {
        result += i;
    }

    printf("%d\n", result);

    for (int i=0; i <= 10; i++)
        printf("%c",str2[i]);

    // printf문을 해보면 '\0' 문자가 중간에 들어가므로 
    // for문에서 result의 누적합은 first까지만 실행한 후 뒤에 문자열이 더 있음에도 null 문자를 만나서 종료된다
    return 0;
}