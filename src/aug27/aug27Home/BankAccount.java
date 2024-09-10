package aug27.aug27Home;

public class BankAccount {
    private static int accountCounter = 0;
    private double balance;
    private int accountNumber;

    public BankAccount() {
        this.balance = 0.0;
        accountCounter++;
        this.accountNumber = accountCounter;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited "+ amount);
    }

    public void deposit(double amount, String description) {
        this.balance += amount;
        System.out.println("Deposited "+amount+"("+description+")");
    }

    public void deposit(BankAccount fromAccount, double amount) {
        if (fromAccount.balance >= amount) {
            fromAccount.balance -= amount;
            this.balance += amount;
            System.out.println("Transferred "+amount +" from account"+ fromAccount.accountNumber);
        } else {
            System.out.println("Insufficient balance in the source account.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(100);
        System.out.println("Account 1 balance: "+account1.getBalance());

        BankAccount account2 = new BankAccount();
        account2.deposit(50, "Salary");
        System.out.println("Account 2 balance: "+ account2.getBalance());

        BankAccount account3 = new BankAccount();
        account3.deposit(account2, 50);
        System.out.println("Account 3 balance: "+account3.getBalance());
        System.out.println("Account 2 balance after transfer: "+ account2.getBalance());
    }
}

