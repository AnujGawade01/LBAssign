// LB Assignment 67 (63)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Develop a client server application where the client can check whether a particular
file exists on the server machine

The client should send :
EXISTS <filename>

Requirements :
 The file checking operation must be performed by the server, not the client

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////


                                        Client


/*///////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class LB332
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("----------------------------------");
            System.out.println("--------- Client Started ---------");
            System.out.println("----------------------------------");

            Socket socket = new Socket("127.0.0.1",
                                       9090
                                       );

            System.out.println("Connection with server is successfull");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
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
