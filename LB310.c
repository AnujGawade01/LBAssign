// LB Assignment 63 (59)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a program which accept matrix from user and reverse the contents of each row

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void ReverseRow( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;
    int jStart = 0, jEnd = 0;
    int temp = 0;
    jEnd = iCol-1;
    
    for(i = 0; i < iRow; i++)
    {
        jStart = 0;
        jEnd = iCol-1;

        while(jStart < jEnd)
        {
            temp = Arr[i][jStart];
            Arr[i][jStart] = Arr[i][jEnd];
            Arr[i][jEnd] = temp;

            jStart++;
            jEnd--;
        }
    }

    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            printf("%d\t",Arr[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int Row = 0;
    int Col = 0;
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
    
    ReverseRow(Row,Col,Brr);

    return 0;
}