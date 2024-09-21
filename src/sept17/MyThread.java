package sept17;

public class MyThread extends Thread{
    int num = 0;

    @Override
    public void run() {
        synchronized (this){
            for(int i=1; i<=100; i++){
                num = num+i;
            }
            this.notify();
        }

    }
}
