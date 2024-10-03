package ajp_java.aug27;

public class Counter {
    static{
        System.out.println("Me hu static bock");
    }
    static int count= 0;

    public Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        
    }
}
