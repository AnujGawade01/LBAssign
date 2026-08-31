// LB Assignment 66 (62)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a Java application that accepts the names of a source file and destination file
and copies all data from the source into the destination

Requirements

 Use:
 FileInputStream
 FileOutputStream

 Read data from the source and write it into the destination

 Do not use the built in copy methods

 The program should be capable of copying text as well as binary files

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB325
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String srcfile = "";
        String destfile = "";

        System.out.println("Enter the Source File name : ");
        srcfile = sobj.nextLine();

        System.out.println("Enter the Destination File name : ");
        destfile = sobj.nextLine();
        
        File srcobj = new File(srcfile);
        File destobj = new File(destfile);

        if((!srcobj.exists()) || !srcobj.isFile())
        {
            System.out.println("Source File does not exists");
            return;
        }

        try
        {
            destobj.createNewFile();

            FileOutputStream fos = new FileOutputStream(destobj);

            FileInputStream fis = new FileInputStream(srcobj);

            byte buffer[] = new byte[1024];

            int bytesread = 0;

            while((bytesread = fis.read(buffer)) != -1)   
            {
                fos.write(buffer,0,bytesread);
            } 

            System.out.println("File copied successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error occurred : "+e);
        }

        sobj.close();
        fis.close();
        fos.close();

    }
}