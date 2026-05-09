import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is listening on port 5000");

        Socket socket = ss.accept();
        System.out.println("Client Connected!");

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String message="";
        String reply="";

        while(!message.equals("over")) {
            message = input.readUTF();

            System.out.println("Client: " + message);
            System.out.print("Server: ");

            reply = reader.readLine();
            output.writeUTF(reply);
        }

        socket.close();
        ss.close();
        
    }
}