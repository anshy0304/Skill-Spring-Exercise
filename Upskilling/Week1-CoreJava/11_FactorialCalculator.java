import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}
