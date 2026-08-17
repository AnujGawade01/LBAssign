// LB Assignment 53 (49)

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Traffic Police Fine Recorder

 Fines:
    No Helmet -> Rs 500
    No License -> Rs 1000
    Overspeeding -> Rs 1500

Input:
    Helmet worn (Yes/No)
    License available (Yes/No)
    Overspeeding (Yes/No)

Validations:
    Input must be Yes/No only

Expected Output:
    Total Fine Amount: Rs<amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB264
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Helmet = "";
        String License = "";
        String Overspeeding = "";

        int iRet = 0;

        System.out.println("Was the Driver wearing a Helmet (Yes/No) : ");
        Helmet = sobj.nextLine();

        System.out.println("Was the Driver's License Available (Yes/No) : ");
        License = sobj.nextLine();

        System.out.println("Was the driver Overspeeding (Yes/No) : ");
        Overspeeding = sobj.nextLine();

        TrafficPol tobj = new TrafficPol();
        iRet = tobj.Fine(Helmet,License,Overspeeding);

        if(iRet == -1)
        {
            System.out.println("Error : Input must be Yes/No only");
        }
        else
        {
            System.out.println("Total Fine Amount: Rs "+iRet);
        }



    }
}

class TrafficPol
{
    public int Fine(String Helmet, String License, String Overspeeding)
    {
        
        boolean isValidHelmet = Helmet.equals("Yes") || Helmet.equals("No");
        boolean isValidLicense = License.equals("Yes") || License.equals("No");
        boolean isValidOverspeeding = Overspeeding.equals("Yes") || Overspeeding.equals("No");

        if (!isValidHelmet || !isValidLicense || !isValidOverspeeding) 
        {
            return -1;
        }

        int Res = 0;

        if (Helmet.equals("No")) 
        {
            Res += 500;
        }
        if (License.equals("No")) 
        {
            Res += 1000;
        }
        if (Overspeeding.equals("Yes")) 
        {
            Res += 1500;
        }

        return Res;

    }
}