package sept18;

import java.util.concurrent.Callable;

public class CallableChild implements Callable {
    int num ;
    public CallableChild(int num){
        this.num = num;
    }

    public Object call() throws Exception{
        System.out.println(Thread.currentThread().getName()+" .. is responsible to find the sum of first "+num+" numbers");

        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
