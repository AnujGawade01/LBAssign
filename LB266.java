// LB Assignment 54 (50)

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Ride Fare Calculator

 Rules:
    Base fare Rs 50
    First 10 km -> Rs 12 per km
    Beyond 10 km -> Rs 15 per km
    Peak hours -> 20% extra on total fare

Input:
    Distance in km(integer)
    Peak hour(Yes/No)

Validations:
    Distance cannot be negative

Expected Output:
    Distance: <km> km
    Peak Hour: <Yes/No>
    Total Fare: Rs<amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB266
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Distance = 0;
        String PeakHr = "";

        int amount = 0;

        System.out.println("Enter the Ride distance in Km : ");
        Distance = sobj.nextInt();

        sobj.nextLine();
        System.out.println("Was the ride done during a peak hour (Yes/No) : ");
        PeakHr = sobj.nextLine();

        Ride robj = new Ride();
        amount = robj.FareCalc(Distance,PeakHr);

        if(amount == -1)
        {
            System.out.println("Error : Distance cannot be negative");
        }
        else
        {
            System.out.println("Distance: Rs " + Distance);
            System.out.println("Peak Hour: Rs " + PeakHr);
            System.out.println("Total Fare: Rs " + amount);
        }
    }
}

class Ride
{
    public int FareCalc(int Distance, String PeakHr)
    {
        if (Distance < 0) 
        {
            return -1;
        }

        int Fare = 50;
        int i = 0;

        if(Distance <= 10)
        {
            for(i = 1; i <= Distance; i++)
            {
                Fare = Fare + 12;
            }
        }
        else if(Distance > 10)
        {
            // for first 10 km
            for(i = 1; i <= 10; i++)
            {
                Fare = Fare + 12;
            }

            for(i = 1; i <= (Distance-10); i++)
            {
                Fare = Fare + 15;
            }
        }

        if(PeakHr.equals("Yes"))
        {
            Fare = (int) (Fare * 1.20);
        }

        return Fare;
    }
}