package sept19;

public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The number " + i + " is printed by " + Thread.currentThread().getName());
        }
    }

}
