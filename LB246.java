// LB Assignment 50

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write java program to accept two file names from user and open first file and create 
 new file (Second name) and copy the data from first file into newly created file
 
/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB246
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        byte Buffer[] = new byte[1024];
        int iRet = 0;

        try
        {
            System.out.println("Enter the Source File name : ");
            String FileSrc = sobj.nextLine();

            System.out.println("Enter the Destination File name : ");
            String FileDest = sobj.nextLine();

            File fsrcobj = new File(FileSrc);
            File fdestobj = new File(FileDest);

            if(fsrcobj.exists())
            {
                fdestobj.createNewFile();

                fiobj = new FileInputStream(FileSrc);
                foobj = new FileOutputStream(FileDest);

                while((iRet = fiobj.read(Buffer)) != -1) 
                {
                    foobj.write(Buffer,0,iRet);
                }
            }
            else
            {
                System.out.println("The source file does not exists");
            }
        }
        catch(IOException iobj) 
        {
            System.out.println(iobj);
        } 
        finally 
        {
            sobj.close();
        }
        
    }
}