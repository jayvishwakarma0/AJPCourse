package sept18;

public class PrintingName implements Runnable{
    String name;
    PrintingName(String name){
        this.name  = name;
    }

    @Override
    public void run() {
        System.out.println(name+" -- Job started by --> "+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" -- Job done by --> "+Thread.currentThread().getName());
    }
}
