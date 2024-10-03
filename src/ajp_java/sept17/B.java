package ajp_java.sept17;

public class B {
    public synchronized void funB(A a){
        System.out.println("funB of class B starts");

        a.fun1();

        System.out.println("funB of class B ends");
    }

    public  void fun2(){
        System.out.println("Inside fun2");
    }
}
