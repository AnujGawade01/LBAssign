// LB Assignment 49

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write java program to accept file name from user and open that file and display the 
 contents on screen
 
/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class LB242
{
    public static void main(String Args[])
    {
        Scanner sobj = null;
        String filename = "";


        try 
        {
            sobj = new Scanner(System.in);
            System.out.println( "Enter the file Name : ");
            filename =  sobj.nextLine();

            sobj.close();

            File fobj = new File(filename);
            sobj = new Scanner(fobj);

            System.out.println("\n--- File Content Start ---");

            while (sobj.hasNextLine()) 
            {
                System.out.println(sobj.nextLine());
            }
            System.out.println("--- File Content End ---");
        }

        catch (FileNotFoundException e) 
        {
            System.out.println("Error: The file '" + filename + "' was not found.");
        } 
        
        finally 
        {
            if (sobj != null) 
            {
                sobj.close();
            }
        }
    }
}