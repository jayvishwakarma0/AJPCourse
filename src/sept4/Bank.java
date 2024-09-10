package sept4;

public class Bank {
    private double amount;

    // Parameterized constructor to initialize the amount
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw funds
    public void withdraw(double withdrawalAmount) {
        // Check if withdrawal amount is valid
        if (withdrawalAmount > 0 && withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
            System.out.println("Withdrawal successful.");;
        } else {
            System.out.println("Insufficient funds for withdrawal.");;
        }
    }

    // Method to deposit funds
    public void deposit(double depositAmount) {
        // Deposit the specified amount
        if (depositAmount > 0) {
            amount += depositAmount;
            System.out.println( "Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Create an instance of the sept4.Bank class
        Bank myAccount = new Bank(10000.0);

        // Display the initial total balance
        myAccount.displayBalance();

        // Withdraw amount
        double withdrawalAmount = 3000;
        myAccount.withdraw(withdrawalAmount);

        // Display the total balance after withdrawal 3000
        myAccount.displayBalance();

        // Deposit 5000
        double depositAmount = 5000;
        myAccount.deposit(depositAmount);

        // Display the total balance after deposit 5000
        myAccount.displayBalance();
    }
}

