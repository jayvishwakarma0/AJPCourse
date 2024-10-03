package ajp_java.aug27.aug27Home;

public class Device {
     String brand;
     String model;
     boolean power;


     void deviceInfo(){
        System.out.println("Device brand is= "+ brand);
        System.out.println("Device model is= "+ model);
    }

     void powerMode(boolean power){
        if(power){
            System.out.println("Power On");
        } else{
            System.out.println("Power Off");
        }
    }
}
class Smartphone extends Device{
        String operatingSystem;
        String cameraResolution;


    void specificInfo(){
           System.out.println("Operating System is= "+operatingSystem);
           System.out.println("Camera resolution is= "+cameraResolution);
       }
        void takePhoto(){
           System.out.println("Photo clicked");
       }
}