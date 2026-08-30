// LB Assignment 65 (61)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Develop a client server application that performs different string operations
The client should send command containing an operation and a string : 

Supported commands :
LENGTH <string>
UPPER <string>
LOWER <string>
REVERSE <string>
PALINDROME <string>
VOWELS <string>

Requirements:
The server should perform all string processing. The client should only accept input and 
display the response.

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////

                                        Client

/*///////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class LB316
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("+---------------------------------------------------+");
            System.out.println("|-------------Marvellous Client Started-------------|");
            System.out.println("+---------------------------------------------------+");

            Socket socket = new Socket("127.0.0.1",
                                       7777
                                       );

            System.out.println("Connection with server is successfull");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("+---------------------------------------------------+");
                System.out.println("String commands");  
                System.out.println("+---------------------------------------------------+");

                System.out.println("Enter command : ");
                String command =  sobj.nextLine().trim();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println(response);

                if((command.toUpperCase()).equals("QUIT"))
                {
                    break;
                }
            }
            socket.close();
            dis.close();
            dos.close();
            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}
