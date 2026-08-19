// LB Assignment 56 (52)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . A fitness app records steps for 7 days. It wants to show how many days user achieved 
the goal and what the highest step count was

Input:
    7 integers (steps)

Validations:
    Steps must be >= 0

Expected Output:
    Goal Achieved Days: <count>
    Maximum Steps in Week: <value>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        int Goal = 0;
        int Steps[] = new int[7];

        int Max = 0;
        int DaysTook = 0;
        
        System.out.println("----------------------Fitness Tracker----------------------");

        System.out.println("Enter the Number of Steps you want to achieve in 7 days: ");
        Goal = sobj.nextInt();
        System.out.println();   // For extra row space in CUI
        
        for(i = 0; i < 7; i++)
        {
            System.out.println("Enter the steps completed on Day "+ (i+1) + ": ");
            Steps[i] = sobj.nextInt();

            if(Steps[i] < 0)    // Validation
            {
                System.out.println("Steps cannot be Negative");
                return;
            }

            System.out.println();   // For extra row space in CUI
        }

        FitnessApp fobj = new FitnessApp();

        DaysTook = fobj.DaysReq(Goal, Steps);

        Max = fobj.MaxStep(Steps);

        if(DaysTook == -1)
        {
            System.out.println("Goal was not Achieved");
            System.out.println("Maximum Steps in WeekDay: "+Max);
        }
        else
        {
            System.out.println("Goal Achieved in : "+DaysTook+" Days");
            System.out.println("Maximum Steps in WeekDay: "+Max);
        }
        
    }
}

class FitnessApp
{
    public int DaysReq(int Goal, int Steps[])
    {
        int i = 0;
        int iCnt = 0;

        for(i = 0; i < Steps.length; i++)
        {
            Goal = Goal - Steps[i];
            iCnt++;

            if(Goal <= 0)
            {
                break;
            }
        }

        if (Goal > 0) 
        {
            return -1; 
        }

        return iCnt;
    }

    public int MaxStep(int Steps[])
    {
        int i = 0;
        int iRet = 0;

        for(i = 0; i < Steps.length; i++)
        {
            if(iRet < Steps[i])
            {
                iRet = Steps[i];
            }
        }

        return iRet;
    }
}
