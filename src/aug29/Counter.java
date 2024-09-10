package aug29;

public class Counter {
    public static int count = 0;
    public static void increment(){
        count += 1;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        increment();
        increment();
        increment();
        System.out.println(count);
    }
}
