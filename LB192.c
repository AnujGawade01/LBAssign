// LB Assignment 39

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Count Even Numbers: Count nodes containing Even values
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

int CountEven(PNODE Head)
{
    int iCount = 0;
    while(Head != NULL)
    {
        if(Head->data % 2 == 0)
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

    InsertFirst(&head,51);
    InsertFirst(&head,30);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    InsertFirst(&head,6);
    InsertFirst(&head,80);
    InsertFirst(&head,100);

    iRet = CountEven(head);

    printf("Nodes containing even values are : %d\n",iRet);

    return 0;
}