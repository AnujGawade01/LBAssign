// LB Assignment 50

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write java program to accept file name from user and check whether that file is regular
 or not
 
/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB247
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if (fobj.exists()) 
        {
            if (fobj.is File()) 
            {
                System.out.println("It is a regular file.");
            } 
            else 
            {
                System.out.println("It is not a regular file.");
            }
        } 
        else 
        {
            System.out.println("Error: File or directory does not exist.");
        }
        
        sobj.close();


           
        
    }
}