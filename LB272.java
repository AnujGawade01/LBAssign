// LB Assignment 55 (51)

/*///////////////////////////////////////////////////////////////////////////////////////

2. Base fare depends on distance slabs. Add charges for class (Sleeper/3AC/2AC). If booking
within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount

Input:
    distance, classType, bookingHoursBefore, age

Output:
    finalFare + reason breakdown

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB272 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int distance = 0;
        String classType = "";
        int age = 0;
        int bookingHoursBefore = 0;

        System.out.print("Enter the distance of trip (in km): ");
        distance = sobj.nextInt();

        sobj.nextLine(); 

        System.out.print("Enter the train class (Sleeper/3AC/2AC): ");
        classType = sobj.nextLine();

        System.out.print("Enter the Booking time before the train departure in Hrs: ");
        bookingHoursBefore = sobj.nextInt();

        System.out.print("Enter the age of the passenger: ");
        age = sobj.nextInt();

        Train tobj = new Train();
        tobj.calculateAndPrintFare(distance, classType, bookingHoursBefore, age);
        
        sobj.close();
    }
}

class Train 
{
    public void calculateAndPrintFare(int distance, String classType, int bookingHoursBefore, int age) 
    {
        double baseFare = 0;
        double classCharge = 0;
        double tatkalCharge = 0;
        double seniorDiscount = 0;

        if (distance <= 50) 
        {
            baseFare = 60;
        } 
        else if (distance <= 150) 
        {
            baseFare = 100;
        } 
        else 
        {
            // Base 120 + Rs 2 for every extra kilometer beyond 150km
            baseFare = 120 + ((distance - 150) * 2);
        }

        if (classType.equalsIgnoreCase("Sleeper")) 
        {
            classCharge = 100;
        } 
        else if (classType.equalsIgnoreCase("3AC")) 
        {
            classCharge = 300;
        } 
        else if (classType.equalsIgnoreCase("2AC")) 
        {
            classCharge = 500;
        } 
        else 
        {
            System.out.println("Error: Invalid Class Type entered.");
            return;
        }

        double subTotal = baseFare + classCharge;
        String breakdown = "Base Fare (" + baseFare + ") + Class Charge (" + classCharge + ")";

        
        if (bookingHoursBefore <= 24) 
        {
            tatkalCharge = subTotal * 0.30;
            subTotal += tatkalCharge;
            breakdown += " + Tatkal 30% (" + tatkalCharge + ")";
        }

        if (age >= 60) 
        {
            seniorDiscount = subTotal * 0.40;
            subTotal -= seniorDiscount;
            breakdown += " - Senior Citizen 40% Discount (" + seniorDiscount + ")";
        }

        System.out.println("\n--- Ticket Fare Details ---");
        System.out.println("Final Fare   : Rs. " + subTotal);
        System.out.println("Breakdown    : " + breakdown);
    }
}
