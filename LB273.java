// LB Assignment 55 (51)

/*///////////////////////////////////////////////////////////////////////////////////////

3. User enters usage: calls(min), data(GB), SMS(count).
   App suggests the cheapest plan among 4 plans

Input:
    mins, gb, sms

Output:
    recommendedPlan, totalCost

Twist: if usage exceeds plan limits, add per-unit extra

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB273 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter calls used (in minutes): ");
        int mins = sobj.nextInt();

        System.out.print("Enter data used (in GB): ");
        int gb = sobj.nextInt();

        System.out.print("Enter SMS used (count): ");
        int sms = sobj.nextInt();

        Telecom robj = new Telecom();
        robj.suggestCheapestPlan(mins, gb, sms);

        sobj.close();
    }
}

class Telecom 
{
    private static class Plan 
    {
        String name;
        double baseCost;
        int maxMins;
        int maxGb;
        int maxSms;

        Plan(String name, double baseCost, int maxMins, int maxGb, int maxSms) 
        {
            this.name = name;
            this.baseCost = baseCost;
            this.maxMins = maxMins;
            this.maxGb = maxGb;
            this.maxSms = maxSms;
        }
    }

    public void suggestCheapestPlan(int mins, int gb, int sms) 
    {
        // 4 structural plans (Name, Base Price, Min Limit, GB Limit, SMS Limit)
        Plan[] plans = 
        {
            new Plan("Plan A (Budget)", 199.0, 100, 2, 50),
            new Plan("Plan B (Value)", 349.0, 300, 10, 100),
            new Plan("Plan C (Data Heavy)", 499.0, 200, 50, 100),
            new Plan("Plan D (Unlimited)", 799.0, 1000, 100, 500)
        };

        double extraMinRate = 1.0;  // Rs. 1 per extra minute
        double extraGbRate = 20.0;  // Rs. 20 per extra GB
        double extraSmsRate = 0.5;  // Rs. 0.5 per extra SMS

        String bestPlanName = "";
        double lowestTotalCost = Double.MAX_VALUE;

        System.out.println("\n--- Cost Breakdown Per Plan ---");

        for (Plan p : plans) 
        {
            double extraCost = 0;

            if (mins > p.maxMins) 
            {
                extraCost += (mins - p.maxMins) * extraMinRate;
            }
            if (gb > p.maxGb) 
            {
                extraCost += (gb - p.maxGb) * extraGbRate;
            }
            if (sms > p.maxSms) 
            {
                extraCost += (sms - p.maxSms) * extraSmsRate;
            }

            double totalCost = p.baseCost + extraCost;
            System.out.printf("%s: Rs. %.2f%n", p.name, totalCost);

            // Track the absolute cheapest plan
            if (totalCost < lowestTotalCost) 
            {
                lowestTotalCost = totalCost;
                bestPlanName = p.name;
            }
        }

        System.out.println("\n--- Recommended Plan ---");
        System.out.println("Cheapest Option : " + bestPlanName);
        System.out.printf("Total Cost      : Rs. %.2f%n", lowestTotalCost);
    }
}

