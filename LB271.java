// LB Assignment 55 (51)

/*///////////////////////////////////////////////////////////////////////////////////////

 1. A hospital bill includes consultation + medicine + room charges per day. If insured,
 insurance covers up to Rs 50,000 or 70% of bill (whichever is lower). ICU ward costs extra

Input:
    days, wardType(Normal/ICU), medicineBill, consultationFee, insured(Yes/No)

Validations:
    all non-negative, wardType valid

Expected Output:
    totalBill, insuranceCover, finalPay

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB271
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int days = 0;
        String wardType = "";
        int medicineBill = 0;
        int consultationFee = 0;
        String insured = "";

        int Total = 0;
        int finalPay = 0;
        int InsureCover = 0;

        System.out.println("Enter the number of days : ");
        days = sobj.nextInt();

        sobj.nextLine();
        System.out.println("Enter the type of ward : ");
        wardType = sobj.nextLine();

        System.out.println("Enter the medicine bill : ");
        medicineBill = sobj.nextInt();

        System.out.println("Enter the consultation fee : ");
        consultationFee = sobj.nextInt();

        sobj.nextLine();
        System.out.println("Was the patient insured : ");
        insured = sobj.nextLine();

        Hospital hobj = new Hospital();
        Total = hobj.TotalBill(days,wardType,medicineBill,consultationFee);

        if(Total == -1)
        {
            System.out.println("Error: Days/Medicine Bill/Consultation Fee cannot be negative");
        }
        else if(Total == -2)
        {
            System.out.println("Error: Ward Type can only be ICU or Normal");
        }
        else
        {
            InsureCover = hobj.InsuranceAdd(Total,insured);

            finalPay = Total - InsureCover; 

            System.out.println("Total Bill: "+Total);
            System.out.println("Insurance Cover: "+InsureCover);
            System.out.println("Final Pay: "+finalPay);
        }

        sobj.close();
    }
}

class Hospital
{
    public int TotalBill(int days, String wardType, int medicineBill, int consultationFee) 
    {
        // Validation
        if((days < 0) || (medicineBill < 0) || (consultationFee < 0))
        {
            return -1;
        }
        if(!wardType.equals("Normal") && !wardType.equals("ICU"))
        {
            return -2;
        }

        int i = 0;
        int Bill = 0;

        if(wardType.equals("ICU"))
        {
            Bill = days * 1000;
        }
        else
        {
            Bill = days * 500;
        }

        Bill = Bill + medicineBill + consultationFee;

        return Bill;        
    }

    public int InsuranceAdd(int Total,String insured)
    {
        int InsureCover = 0;
        if(insured.equals("Yes"))
        {
            if((Total * 0.70) <= 50000)
            {
                InsureCover = (int)(Total * 0.70);
            }
            else
            {
                InsureCover = 50000;
            }   
        }

        return InsureCover;
    }
}