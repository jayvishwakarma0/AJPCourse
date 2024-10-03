package ajp_java.aug28.Home;

public class Animal {
    public void makeSound(){
        System.out.println("Generic Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Sound of dog is Woof");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Sound of cat is Meow");
    }
}
class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Sound of cow is Moo");
    }
}
