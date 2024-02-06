class Account {
    double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }


    public static void main(String[] args) {
        // Creating an account with initial balance
        Account account1 = new Account(1000.0);

        // Depositing amount
        account1.deposit(500.0);

        // Withdrawing amount
        account1.withdraw(200.0);

        // Displaying balance
        account1.displayBalance();
    }
}

