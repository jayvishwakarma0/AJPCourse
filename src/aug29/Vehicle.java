package aug29;

public class Vehicle {
    public void startEngine(){
        System.out.println("Engine is starting");
    }
    protected void vehicleCompany(){
        System.out.println("Company of vehicle is Honda");
    }
}
class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println(" Car engine is starting");
    }

    @Override
    protected void vehicleCompany(){
        System.out.println("Company of vehicle is Bajaj");
    }
}
