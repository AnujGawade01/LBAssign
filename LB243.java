// LB Assignment 49

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write java program to accept file name from user and open that file in write mode and
 write some data at the end of file
 
/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class LB243
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

            String DatatoAppend = sobj.nextLine();

            File fobj = new File(filename);
            sobj = new Scanner(fobj);

            try(FileWriter fileWriter = new FileWriter(fobj, true); PrintWriter printWriter = new PrintWriter(fileWriter)) 
            {
                printWriter.println(DatatoAppend);
                System.out.println("Data successfully written to the end of the file!");
            }
        }
      
        catch (IOException e) 
        {
            System.out.println("Error writing to file : " + e.getMessage());
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