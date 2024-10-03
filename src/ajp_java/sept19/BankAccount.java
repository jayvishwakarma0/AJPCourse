package ajp_java.sept19;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance){
        balance = initialBalance;
    }
    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println(amount+ " is credited in you account.");
    }
    public synchronized void withdraw(int amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println(amount+ " debited from your account");
        } else{
            System.out.println("Insufficient Balance");
        }
    }

    public int getBalance(){
        return balance;
    }
}

class DepositThread extends Thread{
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account,int amount){
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.deposit(amount);
    }
}
class WithdrawThread extends Thread{
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account,int amount){
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.withdraw(amount);
    }
}