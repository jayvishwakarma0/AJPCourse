package aug28.Home;

public abstract class Shape {
    abstract void calculateArea(int r);
}
class Circle extends Shape{
    public void calculateArea(int r){
        System.out.println("Area of circle is "+3.14*r*r);
    }
}class Square extends Shape{
    public void calculateArea(int a){
        System.out.println("Area of square is "+a*a);
    }
}
