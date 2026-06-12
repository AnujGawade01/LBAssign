// LB Assignment 24

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Accept number of Rows and number of columns from user and display below pattern

    Input : iRow = 4 iCol = 4

    Output : A B C D
             a b c d
             A B C D
             a b c d         
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int iCntRow = 0, iCntCol = 0;
    char ch1 = '\0', ch2 = '\0';

    for(iCntRow = 1; iCntRow <= iRow; iCntRow++)
    {
        for(iCntCol = 1, ch1 = 'A', ch2 = 'a'; iCntCol <= iCol; iCntCol++, ch1++, ch2++)
        {   
            if(iCntRow % 2 == 0)
            {
                printf("%c\t",ch2);
            }        
            else
            {
                printf("%c\t",ch1);
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