import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to write to output.txt: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            writer.write(System.lineSeparator());
            System.out.println("Data has been written to output.txt.");
        } catch (IOException exception) {
            System.out.println("Error writing file: " + exception.getMessage());
        }

        scanner.close();
    }
}
