import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(String[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] products = new String[n];

        System.out.println("Enter product names:");
        for (int i = 0; i < n; i++) {
            products[i] = sc.nextLine();
        }

        System.out.print("Enter product to search: ");
        String target = sc.nextLine();

        int index = linearSearch(products, target);

        if (index != -1)
            System.out.println("Product found at index " + index);
        else
            System.out.println("Product not found.");

        sc.close();
    }
}