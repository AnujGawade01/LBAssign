// LB Assignment 54 (50)

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Scholarship Candidate Checker 

 Conditions:
    Marks >= 80%
    Attendance >= 75%
    Family income <= Rs 3,00,000

Input:
    Marks percent(integer)
    Attendance percent(integer)
    Family income (integer)

Validations:
    Marks and attendance must be 0-100
    Income cannot be negative

Expected Output:
    Scholarship Approved
    Or
    Scholarship Rejected: <Reason>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB267
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Marks = 0;
        int Attendance = 0;
        int FamIncome = 0;
        
        String sRet = "";

        System.out.println("Enter the Total Marks of Student : ");
        Marks = sobj.nextInt();

        System.out.println("Enter the Total Attendance of student : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter the Annual Family Income of Student : ");
        FamIncome = sobj.nextInt();

        Scholarship aobj = new Scholarship();
        sRet = aobj.ScholarApprove(Marks,Attendance,FamIncome);
        
        System.out.println(sRet);
    }
}

class Scholarship
{
    public String ScholarApprove(int Marks, int Attendance, int FamIncome) 
    {
        if ((Marks < 0) || (Marks > 100))
        {
            return "Marks should be between 0 to 100";
        }

        if ((Attendance < 0) || (Attendance > 100))
        {
            return "Attendance should be between 0 to 100";
        }
        if (FamIncome < 0) 
        {
            return "Invalid Input: Income cannot be negative";
        }


        if(Marks < 80)
        {
            return "Scholarship Rejected: Marks should be 80 or Above";
        }
        else if(Attendance < 75)
        {
            return "Scholarship Rejected: Attendance should be 75 or Above";
        }
        else if(FamIncome < 300000)
        {
            return "Scholarship Rejected: Annual Family income should be Rs 3,00,000 or below";
        }
        else
        {
            return "Scholarship Approved";
        }
    }
}