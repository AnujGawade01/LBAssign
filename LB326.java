// LB Assignment 66 (62)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a Java application that accepts a filename and displays detailed information
about that file

Requirements

 Use the File class

 Display an appropriate error message if the specified file does not exist

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB326
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String filename = "";

        System.out.println("Enter the File name : ");
        filename = sobj.nextLine();

        File fobj = new File(filename);

        if((!fobj.exists()) || !fobj.isFile())
        {
            System.out.println("File does not exists");
            return;
        }

        System.out.println("File Name       : "+fobj.getName());
        System.out.println("Absolute Path   : "+fobj.getAbsolutePath());
        System.out.println("File Size       : "+fobj.length());
        System.out.println("Readable        : "+fobj.canRead());
        System.out.println("Writable        : "+fobj.canWrite());
        System.out.println("Hidden          : "+fobj.isHidden());
        System.out.println("Last Modified   : "+new Date(fobj.lastModified()));

        sobj.close();
    }
}