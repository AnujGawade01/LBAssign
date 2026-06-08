// LB Assignment 19
/* 1. Write a program to check whether a given year is a leap year on not */

class LB91
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkLeapYear(2024);
    }
}

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }

    }
}

