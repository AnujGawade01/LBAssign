// LB Assignment 52 (48)

/*///////////////////////////////////////////////////////////////////////////////////////

 3. University Student Result Generator

 Each student has marks in five subjects, each out of 100

 Rules:
    If (marks in any subject < 35) -> student is Fail
    If student passes all subjects, calculate average and classify:
        Average >= 75 -> Distinction
        Average >= 60 -> First Class
        Average >= 50 -> Second Class
        Average <  50 -> Pass

Input:
    Five integers (marks in 5 subjects)

Validations:
    Each mark must be between 0 to 100

Expected Output:

    If Failed:
    Result: Fail

    If Successful: 
    Average Marks: <avg>
    Final Result: <Classification>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB258
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int MarksArr[] = new int[5];
        int i = 0;
        int Result = 0;

        System.out.println("Enter Marks of all 5 Subjects : ");
        
        for(i = 0; i < 5;i++)
        {
            MarksArr[i] = sobj.nextInt();
        }

        UniCalc uobj = new UniCalc();

        Result = uobj.ResultGen(MarksArr);

        if(Result == -1)
        {
            System.out.println("Invalid Marks");
        }
        else if(Result == -2)
        {
            System.out.println("Result: Fail");
        }
        else
        {
            System.out.println("Average Marks: "+Result);

            if(Result >= 75)
            {
                System.out.println("Final Result: Distinction");
            }
            else if(Result >= 60)
            {
                System.out.println("Final Result: First Class");
            }
            else if(Result >= 50)
            {
                System.out.println("Final Result: Second Class");
            }
            else
            {
                System.out.println("Final Result: Pass");
            }
        }
    }
}

class UniCalc
{
    public int ResultGen(int Marks[])
    {
        int i = 0;

        int AvgMarks = 0;

        for(i = 0; i < 5; i++)
        {
            if((Marks[i] < 0) || (Marks[i] > 100))
            {
                return -1;  // Invalid Marks
            }

            if((Marks[i] < 35))
            {
                return -2;  // Result: Fail
            }

            AvgMarks = AvgMarks + Marks[i];
        }

        AvgMarks = AvgMarks/i;

        return AvgMarks;
    }
}