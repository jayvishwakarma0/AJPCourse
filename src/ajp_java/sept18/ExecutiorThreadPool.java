package ajp_java.sept18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutiorThreadPool {
    public static void main(String[] args) {
        PrintingName[] arrOfPring = {new PrintingName("sachin"), new PrintingName("priya"),
                new PrintingName("sachin"), new PrintingName("priya"),
                new PrintingName("rahul"), new PrintingName("suresh"),
                new PrintingName("ankana"), new PrintingName("rakesh"),
                new PrintingName("vansh"), new PrintingName("david"),
                new PrintingName("dainy"), new PrintingName("sadhe"),
        };

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(PrintingName n: arrOfPring){
            service.submit(n);
        }

        service.shutdown();

    }
}
