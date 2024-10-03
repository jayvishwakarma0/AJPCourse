package ajp_java.sept2;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int i=10/10;
            int[] arr = new int[5];
            arr[6] = 13/0;
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
