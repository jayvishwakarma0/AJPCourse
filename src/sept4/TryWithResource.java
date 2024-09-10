package sept4;

import java.io.FileOutputStream;

// what is replacement of finally?
// what is try-with-resource
public class TryWithResource {
    public static void main(String[] args) {

//        FileOutputStream outputt = new FileOutputStream("Jay.txt");
//        outputt.close

        try(FileOutputStream output = new FileOutputStream("Jay.txt")){
        String msg = "Welcome to AJP course";

        byte[] arr = msg.getBytes();
        output.write(arr);
            System.out.println("Yes work done");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
