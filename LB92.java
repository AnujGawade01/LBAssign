/* 2. Write a program to display the grade of student based on marks */

class LB92
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayGrade(82);
    }
}

class Logic
{
    void displayGrade(int marks)
    {
        if (marks < 0 || marks > 100) 
        {
            System.out.println("Invalid Marks");
        }
        else if(marks >= 75)
        {
            System.out.println("A+");
        }
        else if(marks >= 60 || marks <= 74)
        {
            System.out.println("A");
        }
        else if(marks >= 45 || marks <= 59)
        {
            System.out.println("B");
        }
        else if(marks >= 35 || marks <= 44)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

