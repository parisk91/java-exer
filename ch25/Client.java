package gr.aueb.cf.ch25;

import java.io.*;
import java.net.Socket;

public class Client {
        public static void main (String[]args){
            try {
                Socket socket = new Socket("127.0.0.1", 1234);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

                System.out.print("Enter file path: ");
                String filePath = reader.readLine();
                writer.println(filePath);

                BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String response;
                while ((response = serverReader.readLine()) != null) {
                    System.out.println(response);
                }
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

