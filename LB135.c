// LB Assignment 27

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Accept number of Rows and number of columns from user and display below pattern

    Input : iRow = 4 iCol = 4

    Output :  1 2 3 4
                2 3 4
                  3 4
                    4

    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int iCntRow = 0, iCntCol = 0;


    for(iCntRow = 1; iCntRow <= iRow; iCntRow++)
    {
        for(iCntCol = 1; iCntCol <= iCol; iCntCol++)
        {   
            
            if(iCntCol < iCntRow) 
            {
                printf("\t");
            }
            else
            {
                printf("%d\t",iCntCol);
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