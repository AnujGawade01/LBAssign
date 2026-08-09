// LB Assignment 50

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write java program to accept directory name from user and create that directory
 
/*///////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class LB248
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String DirName = "";
        File fobj = null;

        System.out.println("Enter the name of Directory : ");
        DirName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory already exists");
        }
        else
        {
            fobj.mkdir();
            System.out.println("Directory created successfully");
        }

        sobj.close();
    }
}