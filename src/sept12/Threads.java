package sept12;

public class Threads {
    public static void main(String[] args) {

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();

        t1.setName("Dhoni");

//        t1.run(); // It will not work as different thread for running the different threads you need

        t1.start();  // two thead will active one is main and another is t1
        t2.start();
        t3.start();
//        ThreadBest t4  = new ThreadBest();
//        Thread tt = new Thread(t4);
//        tt.start();

        String name = Thread.currentThread().getName();

        for(int i=0; i<=50; i++){
            System.out.println(i+" ------> Mai hu main "+name );
        }

        // two ways to create new thread
        // Thread class ko extends karke
        // Runnable interface ko implements karke
    }
}

class ThreadA extends Thread{
    // vo sara kaam likh do jo main ke parallel chalana hai


    public void run(){
        for(int i=51; i<=100; i++){
            String s = Thread.currentThread().getName();
            System.out.println(i+" ------> I am another thread A "+s );
        }
    }
}class ThreadB extends Thread{
    // vo sara kaam likh do jo main ke parallel chalana hai

    public void run(){
        for(int i=101; i<=150; i++){
            System.out.println(i+" ------> I am another thread B");
        }
    }
}class ThreadC extends Thread{
    // vo sara kaam likh do jo main ke parallel chalana hai


    public void run(){
        for(int i=151; i<=200; i++){
            System.out.println(i+" ------> I am another thread C");
        }
    }
}
