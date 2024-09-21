package sept17;

public class ThreadAA  extends Thread{
    A a;
    B b;

    ThreadAA(A a, B b){
        this.a = a;
        this.b= b;
    }

    public void run(){
        a.funA(b);
    }
}
