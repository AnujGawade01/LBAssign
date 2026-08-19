// LB Assignment 56 (52)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . An online election system stores votes by voter ID. Every voter can vote only once. If
the same ID appears again the vote must be rejected and counted as duplicate

Input:
    Number of votes N
    N voter IDs

Validations:
    N >= 0
    IDs must be non-negative integers

Expected Output:
    Valid Votes: <count>
    Rejected Duplicate Votes: <count>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB277
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        int VotesCount = 0;
        System.out.println("Enter the number of votes done: ");
        VotesCount = sobj.nextInt();

        int ID[] = new int [VotesCount];
        System.out.println("Enter the Voter ID's: ");

        for(i = 0; i < VotesCount; i++)
        {
            ID[i] = sobj.nextInt();
        }

        Election eobj = new Election();
        int DupeVote = eobj.VoteCheck(VotesCount,ID);

        if(DupeVote == -1)
        {
            System.out.println("Error: Number of votes cannot be negative");
        }
        else if(DupeVote == -2)
        {
            System.out.println("Error: Voter ID cannot be negative");
        }
        else
        {
            System.out.println("Valid Votes: "+(VotesCount - DupeVote));
            System.out.println("Rejected Duplicate Votes: "+(DupeVote));
        }
    }
}


class Election
{
    public int VoteCheck(int Votes, int ID[])
    {
        if(Votes < 0)
        {
            return -1;
        }

        int i = 0;
        int j = 0;

        int Dupe = 0;

        for(i = 0; i < Votes; i++)
        {
            if(ID[i] < 0)
            {
                return -2;
            }
        }

        for(i = 0; i < Votes; i++)
        {
            
            for(j = 0; j < i; j++)
            {
                if(ID[i] == ID[j])
                {
                    Dupe++;
                    break;
                }
            }
        }


        return Dupe;    
    }
}