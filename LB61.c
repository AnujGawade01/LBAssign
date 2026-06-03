// LB Assignment 13
/* 1. Accept N number from user and return difference between summation of even elements and summation of odd elements */
#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[], int iLength)
{
    int iRes = 0;
    int iCnt = 0;
    int iSumEven = 0, iSumOdd = 0;

    for(iCnt = 0; iCnt<iLength; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iSumEven = iSumEven + Arr[iCnt];
        }

        else
        {
            iSumOdd = iSumOdd + Arr[iCnt];
        }
    }

    iRes = iSumEven - iSumOdd;
    
    return iRes;
}

int main()
{
    int iSize  = 0, iRet = 0, iCnt = 0;
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

    iRet = Difference(p, iSize);

    printf("Result is %d", iRet);

    free(p);
    
    return 0;
}