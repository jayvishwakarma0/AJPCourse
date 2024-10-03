package ajp_java.sept17;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        ThreadAA t1 = new ThreadAA(a,b);
        ThreadBB t2 = new ThreadBB(a,b);

        t1.start();
        t2.start();
    }
}
