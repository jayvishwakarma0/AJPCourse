package Labs;

// class NumberThread1 extending the Thread class
class NumberThread1 extends Thread {
    @Override // overriding the run method of Thread class
    public void run() {
        // printing the number from 0 to 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

// class NumberThread2 extending the Thread class
class NumberThread2 extends Thread {
    @Override // overriding the run method of Thread class
    public void run() {
        // printing the number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // Sleep for 500 milliseconds (0.5 seconds)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab8 {
    public static void main(String[] args) {
        // Question 1
        // Write a program to prints numbers from 0 to 4 using thread
        // Create an instance of NumberThread2
        NumberThread1 t1 = new NumberThread1();

        // Start the thread
        t1.start();


        // Question 2
        // Write a program to prints 1 to 10 and sleep for 500ms using thread
        // Create an instance of NumberThread2
        NumberThread2 t2 = new NumberThread2();

        // Start the thread
        t2.start();
    }
}


