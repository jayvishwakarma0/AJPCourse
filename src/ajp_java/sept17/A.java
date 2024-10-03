package ajp_java.sept17;

public class A {

    // suppose one thread entered into this method
    public synchronized void funA(B b){
        System.out.println("funA of class A starts");

        b.fun2();  // ye call hoga k

        System.out.println("funA of class A ends");
    }

    public synchronized void fun1(){
        System.out.println("Inside fun1");
    }
}
