// LB Assignment 40

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Last Occurrence Position : Return position of last occurence 
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

int LastOccur(PNODE Head, int No)
{
    int iCount = 0;
    int iPos = -1;

    while(Head != NULL)
    {
        iCount++;

        if(Head->data == No)
        {
            iPos = iCount;
        }
        
        Head = Head -> next;
    }

    return iPos;
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

    iRet = LastOccur(head,11);

    if(iRet == -1)
    {
        printf("The Element is not present\n");
    }
    else
    {
        printf("First occurence of the element was at position : %d\n",iRet);
    }

    iRet = LastOccur(head,150);

    if(iRet == -1)
    {
        printf("The Element is not present\n");
    }
    else
    {
        printf("First occurence of the element was at position : %d\n",iRet);
    }

    return 0;
}