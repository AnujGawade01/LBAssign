/* 5. Accept N numbers from user and display summation of digits of each number */
#include<stdio.h>
#include<stdlib.h>

void DigitsSum(int Arr[], int iLength)
{
    int iCnt = 0;
    int iNo = 0;
    int iSum = 0;

    printf("Summation of digit of numbers are : \n");

    for(iCnt = 0; iCnt<iLength; iCnt++)
    {
        
        iSum = 0;
        iNo = Arr[iCnt];

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iSum = iSum + (iNo % 10);
            iNo = iNo/10;
        }

    printf("%d\t",iSum);;
    }
        
}

int main()
{
    int iSize  = 0, iCnt = 0, iValue = 0;
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

    DigitsSum(p, iSize);

    free(p);
    
    return 0;
}
