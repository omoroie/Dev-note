// C에서의 구조체 선언과 연결리스트 정의 및 동작 문법(정처기 실기 연습)
#include <stdio.h>
struct Node {
    struct Node* next;
    unsigned int x;
};

int main() {
    struct Node t1 = {0, 5u};
    struct Node t2 = {0, 10u};
    struct Node t3 = {0, 11u};

    // 3개의 구조체 노드를 선언하고, 각각의 구조체를 초기화를 해준다
    t3.next = &t2;
    t2.next = &t1;
    struct Node* curr = &t3;
    // 각각의 구조체를 next로 연결해준 뒤 포인터 변수인 curr을 선언과 시작점을 지정한다

    int sum = 0;

    while (curr) {
        sum = sum * 3 + curr -> x;
        curr = curr -> next;
    }

    sum = (sum ^ 42u) + 100u;
    printf("%u\n", sum);
    
    return 0;
}