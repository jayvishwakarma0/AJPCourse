package ajp_java.aug29;

public class test2 {
    public static void main(String[] args) {
      Refrigerator ref = new Refrigerator();
      ref.brand = "LG";
      ref.powerConsumption = "20Am";
      ref.applianceInfo();
      ref.turnOn();

      ref.setTemp("20deg");
      System.out.println(ref.getTemp());
      System.out.println();

      Oven oven = new Oven();
      oven.brand = "Sony";
      oven.powerConsumption = "15Am";
      oven.applianceInfo();
      oven.maxTemp = "500deg";
      System.out.println("Maximum temprature of oven is "+oven.maxTemp);

      oven.setTemp("90deg");
      System.out.println(oven.getTemp());


    }
}
