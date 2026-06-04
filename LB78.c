/* 3. Accept N numbers from user and return the difference between largest and smallest number */
#include<stdio.h>
#include<stdlib.h>

//#define TRUE 1
//#define FALSE 0

//typedef int BOOL;

int Difference(int Arr[], int iLength)
{
    int iRes = 0, iMax = 0, iMin = 0;
    int iCnt = 0;

    for(iCnt = 0, iMin = Arr[0], iMax = Arr[0]; iCnt<iLength; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }

        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    }
        
    iRes = iMax - iMin;

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

    iRet = Difference(p, iSize);

    printf("Difference is %d",iRet);

    free(p);
    
    return 0;
}