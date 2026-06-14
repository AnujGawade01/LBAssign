// LB Assignment 25

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Accept number of Rows and number of columns from user and display below pattern

    Input : iRow = 5 iCol = 5

    Output : a b c d e
             1 2 3 4 5
             a b c d e
             1 2 3 4 5
             a b c d e 
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int iCntRow = 0, iCntCol = 0;
    char ch = '\0';


    for(iCntRow = 1; iCntRow <= iRow; iCntRow++)
    {
        for(iCntCol = 1, ch = 'a'; iCntCol <= iCol; iCntCol++, ch++)
        {   
            if(iCntRow % 2 != 0)
            {
                printf("%c\t",ch);
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