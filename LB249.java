// LB Assignment 50

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write java program to accept file name from user calculate checksum of that file and
 display on screen
 
/*///////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;
import java.security.*;

class LB249
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;
        int iRet = 0;
        MessageDigest md = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            md = MessageDigest.getInstance("MD5");
            FileInputStream fis = new FileInputStream(fobj);
            
            byte[] buffer = new byte[8192];

            while ((iRet = fis.read(buffer)) != -1) 
            {
                md.update(buffer, 0, iRet);
            }

            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) 
            {
                sb.append(String.format("%02x", b));
            }

            System.out.println("Checksum (MD5): " + sb.toString());
        }
    
    }
}