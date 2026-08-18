// LB Assignment 55 (51)

/*///////////////////////////////////////////////////////////////////////////////////////

5. Cinema Seat Booking with Row Pricing + Group Discount

Seats have different prices per row. User tries booking multiple seats, reject if already
booked. If group size >= 6 give 10% discount

Input:
    rows, cols, bookedSeatList, requestedSeatList

Output:
    success/fail + total cost + remaining seats

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class LB275 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter total rows : ");
        int rows = sobj.nextInt();

        System.out.print("Enter total columns: ");
        int cols = sobj.nextInt();

        List<Seat> bookedSeatList = new ArrayList<>();
        System.out.print("Enter number of already booked seats: ");
        int numBooked = sobj.nextInt();

        System.out.println("Enter row and col for each booked seat:");
        for (int i = 0; i < numBooked; i++) 
        {
            bookedSeatList.add(new Seat(sobj.nextInt(), sobj.nextInt()));
        }

        List<Seat> requestedSeatList = new ArrayList<>();
        System.out.print("Enter number of seats to book: ");
        int numReq = sobj.nextInt();

        System.out.println("Enter row and col for each requested seat:");
        for (int i = 0; i < numReq; i++) 
        {
            requestedSeatList.add(new Seat(sobj.nextInt(), sobj.nextInt()));
        }

        BookingLogic.bookSeats(rows, cols, bookedSeatList, requestedSeatList);
        
        sobj.close();
    }
}

class Seat 
{
    int r, c;
    Seat(int r, int c) 
    { 
        this.r = r; 
        this.c = c; 
    }
}

class BookingLogic 
{
    public static void bookSeats(int totalRows, int totalCols, List<Seat> booked, List<Seat> requested) {
        // 1. Validate availability and boundaries
        for (Seat s : requested) 
        {
            boolean isBooked = booked.stream().anyMatch(b -> b.r == s.r && b.c == s.c);
            if (s.r < 1 || s.r > totalRows || s.c < 1 || s.c > totalCols || isBooked) 
            {
                System.out.println("Status: Fail");
                return;
            }
        }

        double cost = 0;
        
        for (Seat s : requested) 
        {
            cost += (s.r <= 2) ? 15.0 : (s.r <= 5) ? 12.0 : 10.0;
        }

        if (requested.size() >= 6) cost *= 0.90;

        booked.addAll(requested);
        int remaining = (totalRows * totalCols) - booked.size();

        System.out.println("Status: Success");
        System.out.printf("Total Cost: $%.2f\n", cost);
        System.out.println("Remaining Seats: " + remaining);
    }
}

