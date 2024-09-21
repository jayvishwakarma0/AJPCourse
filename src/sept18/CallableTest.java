package sept18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableTest {
    public static void main(String[] args) {
        CallableChild[] arr = {
                new CallableChild(1),
                new CallableChild(10),
                new CallableChild(100),
                new CallableChild(50),
                new CallableChild(20),
                new CallableChild(1000)
        };

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(CallableChild c: arr){
            service.submit(c);
        }
        service.shutdown();
    }
}
