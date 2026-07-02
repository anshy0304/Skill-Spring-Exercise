import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+' -> System.out.println("Result: " + (firstNumber + secondNumber));
            case '-' -> System.out.println("Result: " + (firstNumber - secondNumber));
            case '*' -> System.out.println("Result: " + (firstNumber * secondNumber));
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
            }
            default -> System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
