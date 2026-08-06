// LB Assignment 49

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write java program to accept file name from user and open that file
 
/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class LB241
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println( "Enter the file Name : ");
        String filename = sobj.nextLine();

        File fobj = new File(filename);

        if(fobj.exists())
        {
            System.out.println("File opened successfully");
            System.out.println("File path :"+fobj.getAbsolutePath());
        }
        else
        {
            System.out.println("Error : File does not exist");
        }

        sobj.close();
    }
}