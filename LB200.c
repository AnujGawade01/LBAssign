// LB Assignment 40

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Count numbers Less than X
 Consider Singly Linear LinkedList to solve it

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

int CountLess(PNODE Head, int No)
{
    int iCount = 0;

    while(Head != NULL)
    {

        if(Head->data < No)
        {
            iCount++;
        }
        
        Head = Head -> next;
    }

    return iCount;
}

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(NULL == *first)
    {
        *first = newn;
    }
    else
    {
        newn -> next = *first;
        *first = newn;
    }
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,11);
    InsertFirst(&head,30);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    InsertFirst(&head,6);
    InsertFirst(&head,80);
    InsertFirst(&head,11);

    iRet = CountLess(head,20);
    printf("ELements less than the number are : %d\n",iRet);

    iRet = CountLess(head,50);
    printf("ELements less than the number are : %d\n",iRet);

    return 0;
}