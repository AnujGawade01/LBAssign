// LB Assignment 23

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Accept number of Rows and number of columns from user and display below pattern

    Input : iRow = 3 iCol = 5

    Output : 5 4 3 2 1 
             5 4 3 2 1 
             5 4 3 2 1 
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int iCntRow = 0, iCntCol = 0;

    for(iCntRow = 1; iCntRow <= iRow; iCntRow++)
    {
        for(iCntCol = iCol; iCntCol >= 1; iCntCol--)
        {
            printf("%d\t",iCntCol);
        }
        printf("\n");   
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows & columns: \n");
    scanf("%d %d",&iValue1, &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}