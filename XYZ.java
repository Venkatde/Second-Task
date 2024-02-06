import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Accept five product information from the user and store in an array
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1)); //Looping starts here
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find the pid of the product with the highest price
        int maxPriceProductPid = findProductWithMaxPrice(products);
        System.out.println("Product ID with the highest price: " + maxPriceProductPid);

        // Calculate and print the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);
    }

    private static int findProductWithMaxPrice(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int maxPriceProductPid = -1;

        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPriceProductPid = product.pid;
            }
        }

        return maxPriceProductPid;
    }

    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.getTotalAmountSpent();
        }

        return totalAmountSpent;
    }
}