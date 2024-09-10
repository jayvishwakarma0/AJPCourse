package sept2;

public class FinallyUsage {
    public static void main(String[] args) {
        try{
//            int i=10/0;  // this will give exception
            return;
        }
        catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println(e);
        }


        finally {
            System.out.println("Finally block excuted");
        }

        System.out.println("Normal flow of code will be maintained");
    }
}
