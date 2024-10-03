package ajp_java.sept13;

public class A implements Runnable{
    int sum = 0;
    @Override
    public void run() {
        for(int i=1; i<=10 ; i++){
            sum+= i;
        }
    }
}
