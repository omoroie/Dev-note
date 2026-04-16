#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* next;
} Node;

Node* addFront(Node* head, int data) {
    Node* new_node = (Node*)malloc(sizeof(Node));
    new_node->data = data;
    new_node->next = head;
    return new_node;
}

Node* moveToFront(Node* head, int data) {
    if (head == NULL || head->data == data) 
        return head;

    Node *prev = NULL, *curr = head;

    while (curr != NULL && curr->data != data) {
        prev = curr;
        curr = curr->next;
    }
    if (curr != NULL && prev != NULL) {
        prev->next = curr->next;
        curr->next = head;
        head = curr;
    }
    return head;
}

int main() {
    Node* head = NULL;
    for (int i = 1; i <= 5; i++)
        head = addFront(head, i);
    
    head = moveToFront(head, 3);

    Node* curr = head;
    while (curr != NULL) {
        printf("%d ", curr->data);
        curr = curr->next;
    }
    return 0;
}