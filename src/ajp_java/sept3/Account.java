package ajp_java.sept3;

public class Account {
    double amount;
    public Account(double amount) throws InsufficientFundException{
        if(amount<500){
            throw new InsufficientFundException("Can't open account");
        }
        this.amount = amount;
    }
    public void withdraw(double am) throws InsufficientFundException{
        if(am>amount){
            throw new InsufficientFundException("Low balance");
        }
        amount = amount - am;
        System.out.println("Receive money "+ am+"Rs.");
    }

    public static void main(String[] args) {
       try{
           Account ac = new Account(500);
           ac.withdraw(200);
       }
       catch (InsufficientFundException e){
           e.printStackTrace();
       }
    }
}
