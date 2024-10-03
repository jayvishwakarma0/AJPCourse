package ajp_java.sept12;

public class ThreadBest implements Runnable {
    public void run(){
        for (int i=0; i<=100; i++){
            System.out.println(i+"----> I am thread ");
        }
    }
}
