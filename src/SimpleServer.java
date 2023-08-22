import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try{
            System.out.println("1. Before Starting the Server Socket");
            ServerSocket serverSocket = new ServerSocket(50001);
            System.out.println("2. After creating the Server Socket");
            System.out.println("3. Before Accepting the Client");
            Socket client =serverSocket.accept();
            System.out.println("4. After Accepting the Client");
            System.out.println("5. Before writing  the data to client");
            DataOutputStream dataOutputStream =new DataOutputStream(client.getOutputStream());
            dataOutputStream.writeBytes("Hello ");
            System.out.println("6. After writing  the data to client");
            System.out.println("7. Before Closing  the connection to the client");
            client.close();
            System.out.println("8. After Closing the connection to the client");

        }
        catch(IOException e)
        {
            e.printStackTrace();;
        }

    }
}
