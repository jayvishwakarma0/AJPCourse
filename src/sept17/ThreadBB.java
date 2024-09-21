package sept17;

public class ThreadBB  extends Thread{
    A a;
    B b;

    ThreadBB(A a, B b){
        this.a = a;
        this.b= b;
    }

    public void run(){
       b.funB(a);
    }
}