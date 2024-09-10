package aug28.Home;

public class test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        Shape circle = new Circle();
        Shape square = new Square();

        circle.calculateArea(5);
        square.calculateArea(4);

    }
}
