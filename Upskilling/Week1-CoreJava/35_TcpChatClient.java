import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class TcpChatClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port);
             BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server. Type messages, or 'bye' to exit.");
            while (true) {
                System.out.print("Client: ");
                String message = console.readLine();
                serverOutput.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }

                String response = serverInput.readLine();
                if (response == null) {
                    break;
                }
                System.out.println("Server: " + response);
            }
        } catch (IOException exception) {
            System.out.println("Client error: " + exception.getMessage());
        }
    }
}
