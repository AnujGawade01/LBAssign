// LB Assignment 25

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Accept number of Rows and number of columns from user and display below pattern

    Input : iRow = 4 iCol = 4

    Output : 2 4 6 8 10
             1 3 5 7 9
             2 4 6 8 10
             1 3 5 7 9  
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int iCntRow = 0, iCntCol = 0;


    for(iCntRow = 1; iCntRow <= iRow; iCntRow++)
    {
        for(iCntCol = 1; iCntCol <= iCol; iCntCol++)
        {   
            if(iCntRow % 2 == 0)
            {
                printf("%d\t",(iCntCol * 2) - 1);
            }
            else
            {
                printf("%d\t",(iCntCol * 2));
            }
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