// LB Assignment 54 (50)

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Phone Battery Status

Rules:
    Battery <= 5%  -> Critical
    Battery <= 15% -> Low
    Otherwise      -> Normal

Input:
    Battery percentage(integer)

Validations:
    0 to 100 only

Expected Output:
    Battery Percentage: <value>%
    Status: <Critical/Low/Normal>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB270
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Battery = 0;

        String sRet = "";

        
        System.out.println("Enter the battery in percentage : ");
        Battery = sobj.nextInt();


        Phone pobj = new Phone();
        sRet = pobj.BatteryStatus(Battery);

        System.out.println("Battery Percentage: "+Battery);
        System.out.println("Status: "+sRet);
    }
}

class Phone
{
    public String BatteryStatus(int Battery) 
    {
        // Validation
        if((Battery < 0) || (Battery > 100))
        {
            return "Error: Battery can only be between 0 to 100";
        }

        if(Battery <= 5)
        {
            return "Critical";
        }
        else if(Battery <= 15)
        {
            return "Low";
        }
        else
        {
            return "Normal";
        }
    }
}