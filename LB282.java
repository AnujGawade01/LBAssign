// LB Assignment 57 (53)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Design a Java application to manage cinema hall seating using a 2D array.
The cinema hall has:
    Rows representing seat rows
    Columns representing seats in each row
Each seat is represented as:
    0 -> Empty
    1 -> Booked

Requirements:
Your program must:
    Count Total booked seats
    Find row with maximum bookings
    Check if any row is completely full
    Display seat matrix

Input Format:
    First Line: Integer R (rows)
    Second Line: Integer C (columns)
    Next R lines: C integers (0 or 1)

Validations:
    R > 0
    C > 0
    Matrix values must be 0 or 1 only
    Each mark must be between 0 and 100

Output Format:
    
Total Booked seats: <count>
Row with Maximum Bookings: Row <number>
Full Row Exists: Yes/No

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB282
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Row = 0;
        int Col = 0;

        System.out.println("Enter number of seat rows in Cinema Hall: ");
        Row = sobj.nextInt();

        System.out.println("Enter number of seat columns in Cinema Hall: ");
        Col = sobj.nextInt();

        if((Row <= 0) || (Col <= 0))
        {
            System.out.println("Invalid Input for Rows and Columns");
            return;
        }

        int Seats[][] = new int[Row][Col];

        System.out.println("Enter the Seat Occupancy (0: Empty | 1: Booked) ");
        for(int i = 0; i < Row; i++)
        {
            for(int j = 0; j < Col; j++)
            { 
                Seats[i][j] = sobj.nextInt();

                if((Seats[i][j] < 0) || (Seats[i][j] > 1))
                {
                    System.out.println("Invalid Input for Seat occupancy");
                    return;
                }
            }
        }

        int BookedCnt = 0;
        int Max = 0;
        boolean Full = false;

        CinemaHall cobj = new CinemaHall();
        BookedCnt = cobj.BookedSeat(Row,Col,Seats);
        Max = cobj.MaxBookedRow(Row,Col,Seats);
        Full = cobj.FullRowChecker(Row,Col,Seats);

        System.out.println("\nTotal Booked seats: "+BookedCnt);
        System.out.println("Row with Maximum Bookings: "+Max);

        if(Full == true)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }
    }
}

class CinemaHall
{
    public int BookedSeat(int Row, int Col, int Seats[][])
    {
        int iCnt = 0;

        for(int i = 0; i < Row; i++)
        {
            for(int j = 0; j < Col; j++)
            {
                if(Seats[i][j] == 1)
                {
                    iCnt++;
                }
            }
        }

        return iCnt;
    }

    public int MaxBookedRow(int Row, int Col, int Seats[][])
    {
        int MaxIndex = 0;
        int MaxBooking = 0;
        int Count[] = new int[Row];

        for(int i = 0; i < Row; i++)
        {
            int Sum = 0;

            for(int j = 0; j < Col; j++)
            {
                Sum = Sum + Seats[i][j];   
            }

            if(Sum > MaxBooking) 
            {
                MaxBooking = Sum;
                MaxIndex = i + 1; // to start row numbering from 1
            }
        }

        return MaxIndex;
    }

    public boolean FullRowChecker(int Row, int Col, int Seats[][])
    {
        boolean bRet = false;
        int Sum = 0;

        for(int i = 0; i < Row; i++)
        {
            Sum = 0;

            for(int j = 0; j < Col; j++)
            {
                Sum = Sum + Seats[i][j];
            }

            if(Sum == Col)
            {
                bRet = true;
                break;
            }
        }

        return bRet;
    }
}