// LB Assignment 62 (58)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a program which accept matrix & one number from user and return frequency of that
    number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int Frequency( int iRow, int iCol, int Arr[iRow][iCol], int iNo)
{
    int iCount = 0;
    int i = 0, j = 0;
    
    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            if(Arr[i][j] == iNo)
            {
                iCount++;
            }
        }
    }

    return iCount;
}

int main()
{
    int Row = 0;
    int Col = 0;
    int iRet = 0;
    int iNo = 0;
    int i = 0, j = 0;
    
    printf("Enter the number of Rows : \n");
    scanf("%d",&Row);

    printf("Enter the number of Columns : \n");
    scanf("%d",&Col);

    int Brr[Row][Col];

    printf("Enter the Elements of the Matrix: \n");
    
    for(i = 0; i < Row; i++)
    {
        for(j = 0; j < Col; j++)
        {
            scanf("%d",&Brr[i][j]);
        }
    }

    printf("Enter the number to get its frequency : \n");
    scanf(" %d",&iNo);
    
    iRet = Frequency(Row,Col,Brr,iNo);

    printf("Frequency is : %d",iRet);

    return 0;
}