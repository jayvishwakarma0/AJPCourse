package ajp_java.aug27.aug27Home;

public class Test {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.brand = "Vivo";
        s.model = "Y71";
        s.power = true;
        s.operatingSystem = "Android";
        s.cameraResolution = "48px";

        s.deviceInfo();
        s.powerMode(s.power);
        s.specificInfo();
        s.takePhoto();
    }
}
