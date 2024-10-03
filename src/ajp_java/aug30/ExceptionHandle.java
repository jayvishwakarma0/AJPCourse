package ajp_java.aug30;

// Java me jo bhi jiche use karte hai usko import karna padta hai
// but there is no need to import java.lang package

// All exceptions are compile time exception except runtime exception
public class ExceptionHandle {
    public static void main(String[] args) {
          try{
              int a = 10/0;
              System.out.println(a);
          } catch (Exception e){
              e.printStackTrace();
          }
    }
}
