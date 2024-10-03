package ajp_java.aug29;

public abstract class Vehicle2 {
    abstract void drive();

}
class Car2 extends Vehicle2{
    void drive(){
        System.out.println("Driving car on the road");
    }
}
class Motorcycle extends Vehicle2{
    void drive(){
        System.out.println("Riding bike on the road");
    }
}
