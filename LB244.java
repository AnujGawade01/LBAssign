// LB Assignment 49

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write java program to accept file name from user and create new file of that name if 
 it is not existing
 
/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class LB244
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

            File fobj = new File(filename);

            try
            {
                if (fobj.createNewFile()) 
                {
                    System.out.println("Success: New file created successfully!");
                    System.out.println("File path: " + fobj.getAbsolutePath());
                } 
                else 
                {
                    System.out.println("Notice: File already exists. No new file was created.");
                } 
            }
            catch (IOException e) 
            {
                System.out.println("An error occurred while creating the file: " + e.getMessage());
            } 
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