package sept17;

public class Demo {
    public static void main(String[] args) {
        MyThread tt = new MyThread();

        tt.start();

        // tt.join();  // we can suspend the main thread
       // Thread.sleep(1000);

        try {
           synchronized (tt){  // here we are lock tt object
               tt.wait(); // it will release the lock
           }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(tt.num);
    }
}
