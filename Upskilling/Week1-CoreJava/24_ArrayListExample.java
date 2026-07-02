import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.println("Enter student names. Type 'done' to finish.");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(name);
        }

        System.out.println("Students:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
