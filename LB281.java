// LB Assignment 57 (53)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Design a Java application that analyzes student performance using a 2D matrix
A college stores marks of students in multiple subjects using a matrix:
    Rows represent Students
    Columns represent subjects
Your program must analyze academic performance based on this matrix

Requirements:
Your program should:
    Calculate total marks of each student
    Identify the topper (student with highest total)
    Calculate average marks for each subject
    Print students who failed in an subject (marks < 35)

Input Format:
    First Line: Integer N (number of students)
    Second Line: Integer M (number of subjects)
    Next N lines: M integers each (marks of each student)

Validations:
    N > 0
    M > 0
    Each mark must be between 0 and 100
If invalid input is found, print:

Invalid Input

Output Format:
    
Student Totals:
Student 1: <total>
Student 2: <total>

Topper: Student <index>

Subject Averages:
Subject 1: <avg>
Subject 2: <avg>
...

Students Failed:
<Student numbers>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB281
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int NStudent = 0;
        int MSubject = 0;

        System.out.println("Enter number of students: ");
        NStudent = sobj.nextInt();

        System.out.println("Enter number of subjects: ");
        MSubject = sobj.nextInt();

        if((NStudent <= 0) || (MSubject <= 0))
        {
            System.out.println("Invalid Input");
            return; 
        }
        
        int MarksMatrix[][] = new int[NStudent][MSubject];

        System.out.println("Enter the Students Marks per subject: ");
        for(int i = 0; i < NStudent; i++)
        {
            for(int j = 0; j < MSubject; j++)
            {
                MarksMatrix[i][j] = sobj.nextInt();

                if((MarksMatrix[i][j] < 0) || (MarksMatrix[i][j] > 100))
                {
                    System.out.println("Invalid Input"); 
                    return;
                }
            }
        }

        int TotalMrks[] = null;
        int TopperInx = 0;
        int Avg[] = null;
        int Failed[] = null;
        int i = 0;

        College cobj = new College();
        
        TotalMrks = cobj.TotalMarks(NStudent,MSubject,MarksMatrix);
        TopperInx = cobj.Topper(TotalMrks);
        Avg = cobj.AvgSubMarks(NStudent,MSubject,MarksMatrix);
        Failed = cobj.StudentFailed(NStudent,MSubject,MarksMatrix);

        System.out.println();
        System.out.println("Student Totals:");

        for(i = 0; i < NStudent; i++)
        {
            System.out.println("Student "+(i+1)+" : "+TotalMrks[i]);
        }

        System.out.println();
        System.out.println("Topper: Student "+(TopperInx+1));

        System.out.println();
        System.out.println("Subject Averages:");
        for(i = 0; i < MSubject; i++)
        {
            System.out.println("Subject "+(i+1)+" : "+Avg[i]);
        }

        System.out.println();
        System.out.println("Students Failed:");

       
        for (i = 0; i < Failed.length; i++) 
        {
            if(Failed[i] == -1)
            {
                System.out.println("Student " + (i+1));
            }
        }
        

    }
}

class College
{
    public int[] TotalMarks(int Student, int Subject, int Marks[][]) // per Student total marks
    {
        int Total[] = new int[Student];
        int Sum = 0;

        for(int i = 0; i < Student; i++)
        {
            Sum = 0; 

            for(int j = 0; j < Subject; j++)
            {
                Sum = Sum + Marks[i][j];
            }

            Total[i] = Sum;
        }

        return Total;
    }

    public int Topper(int TotalMrks[])
    {
        int iMax = 0;

        for(int i = 0; i < TotalMrks.length; i++)
        {
            if(TotalMrks[iMax] < TotalMrks[i])
            {
                iMax = i;
            }
        }

        return iMax;
    }

    public int[] AvgSubMarks(int Student, int Subject, int Marks[][])
    {
        int AvgMarks[] = new int[Subject];
        int Sum = 0;

        for(int i = 0; i < Subject; i++)
        {
            Sum = 0;

            for(int j = 0; j < Student; j++)
            {
                Sum = Sum + Marks[j][i];
            }

            AvgMarks[i] = Sum/Student;
        }

        return AvgMarks;
    }

    public int[] StudentFailed(int Student, int Subject, int Marks[][])
    {
        /*int count = 0;
        
        for(int i = 0; i < Student; i++) 
        {
            for(int j = 0; j < Subject; j++) 
            {
                if(Marks[i][j] < 35) 
                {
                    count++;
                    break; 
                }
            }
        }

        int index = 0;
        int failedList[] = new int[count];

        for(int i = 0; i < Student; i++) 
        {
            for(int j = 0; j < Subject; j++) 
            {
                if(Marks[i][j] < 35) 
                {
                    failedList[index] = i;
                    index++;
                    break; 
                }
            }
        } 
        
        return failedList;
        */

        int failedArr[] = new int[Student];

        for(int i = 0; i < Student; i++) 
        {
            for(int j = 0; j < Subject; j++) 
            {
                if(Marks[i][j] < 35) 
                {
                    failedArr[i] = -1;
                    break; 
                }
            }
        }
         return failedArr; // failed array
        
    }
}