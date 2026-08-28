// LB Assignment 64 (60)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Develop a client server application where the server performs different number related
operations requested by the client
The client should send commands in the following format : 

EVEN <number>
ODD <number>
PRIME <number>
PERFECT <number>
FACTORIAL <number>
REVERSE <number>

Requirements:
Write separate methods for different mathematical operations
Server should identify the requested operation
Invalid commands should generate an appropriate message
Server should support multiple client

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
                                       5555
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
