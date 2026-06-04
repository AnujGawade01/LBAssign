// LB Assignment 16
/* 1. Accept N numbers from user and return the largest number */
#include<stdio.h>
#include<stdlib.h>

//#define TRUE 1
//#define FALSE 0

//typedef int BOOL;

int Maximum(int Arr[], int iLength)
{
    int iRes = 0;
    int iCnt = 0;

    for(iCnt = 0, iRes = Arr[0]; iCnt<iLength; iCnt++)
    {
        if(Arr[iCnt] > iRes)
        {
            iRes = Arr[iCnt];
        }
    }

    return iRes;
}

int main()
{
    int iSize  = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d",&iSize);

    p = (int *) malloc (iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements \n", iSize);

    for( iCnt=0 ; iCnt<iSize ; iCnt++ )
    {
        printf("Enter element : %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet = Maximum(p, iSize);

    printf("Largest number is %d",iRet);

    free(p);
    
    return 0;
}