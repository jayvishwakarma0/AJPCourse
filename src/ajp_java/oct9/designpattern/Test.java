package ajp_java.oct9.designpattern;

public class Test {


    public static void main(String[] args) {
        //Student s  = new Student();
        //s.study()
        Computer obj  = new  Computer.ComputerBuilder()// obj of ander class
                .setHDD("1tb")
                .setRam("4gb")
                .setisGraphicalCardSlots(true)
                .build() ;

        System.out.println(obj.isGraphicalCardSlots());

    }
}