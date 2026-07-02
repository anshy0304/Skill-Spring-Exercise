import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReading {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }
    }
}
