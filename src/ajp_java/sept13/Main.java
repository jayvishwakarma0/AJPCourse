package ajp_java.sept13;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);

        t.start();

        try{
            // main thread will stop until work is not done
            t.join();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(a.sum);
    }
}
