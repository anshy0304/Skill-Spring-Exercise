import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class TcpChatServer {
    public static void main(String[] args) {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port + "...");
            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Client connected.");
                String message;
                while ((message = input.readLine()) != null) {
                    System.out.println("Client: " + message);
                    if (message.equalsIgnoreCase("bye")) {
                        break;
                    }

                    System.out.print("Server: ");
                    output.println(console.readLine());
                }
            }
        } catch (IOException exception) {
            System.out.println("Server error: " + exception.getMessage());
        }
    }
}
