// LB Assignment 65 (61)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Extend the existing client server application by implementing commands that provide 
information about the server

Implement :
DATE 
TIME 
SERVERNAME
HELP
QUIT

Requirements:
HELP should display all commands supported by the server
Quit shold terminate the connection with the current client without terminating the server

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
                System.out.println("Give commands");  
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
