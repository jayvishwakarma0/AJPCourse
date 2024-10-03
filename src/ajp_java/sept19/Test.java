package ajp_java.sept19;

public class Test {
    public static void main(String[] args) {
//        PrintNumbers p1 = new PrintNumbers();
//        PrintNumbers p2 = new PrintNumbers();
//        PrintNumbers p3 = new PrintNumbers();
//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        Thread t3 = new Thread(p3);
//        t1.start();
//        t2.start();
//        t3.start();

        BankAccount account = new BankAccount(1000);
        System.out.println(account.getBalance());

        DepositThread d = new DepositThread(account,500);
        WithdrawThread w = new WithdrawThread(account,300);

        d.start();
        w.start();

        try {
            d.join();
            w.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getBalance());



    }
}
