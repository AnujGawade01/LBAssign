// LB Assignment 64 (60)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Develop a multithreaded client server application in Java that performs mathematical
operations remotely

The client should accept a command from user and send that command to the server

The server should parse the received command perform the requested mathematical operation,
and return the result to the client

The server should support the following commands:

ADD <No1> <No2>
SUB <No1> <No2>
MULT <No1> <No2>
DIV <No1> <No2>
MOD <No1> <No2>
MAX <No1> <No2>
MIN <No1> <No2>
QUIT

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
            System.out.println("-----------------------------------");
            System.out.println("-----Marvellous Client Started-----");
            System.out.println("-----------------------------------");

            Socket socket = new Socket("127.0.0.1",
                                       7777
                                       );

            System.out.println("Connection with server is successfull");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("-----------------------------------");
                System.out.println("Mathematical commands");
                System.out.println("-----------------------------------");

                System.out.println("Enter command : ");
                String command =  sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println(response);

                if((command.toUpperCase()).equals("QUIT"))
                {
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}
