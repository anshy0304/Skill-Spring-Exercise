import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(String[] products, String target) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = target.compareToIgnoreCase(products[mid]);

            if (result == 0)
                return mid;

            if (result > 0)
                low = mid + 1;
            else
                high = mid - 1;
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

        Arrays.sort(products);

        System.out.print("Enter product to search: ");
        String target = sc.nextLine();

        int index = binarySearch(products, target);

        if (index != -1)
            System.out.println("Product found at index " + index);
        else
            System.out.println("Product not found.");

        sc.close();
    }
}