import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
    
        System.out.println("Connected to server");

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String message="";
        String reply="";

        while(!message.equals("over")) {
            System.out.print("Client: ");
            message = reader.readLine();
            output.writeUTF(message);

            reply = input.readUTF();
            System.out.println("Server: " + reply);
        }

        socket.close();
    }
}