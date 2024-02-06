public class Product {

    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }


    public double getTotalAmountSpent() {
        return price * quantity;
    }
}
