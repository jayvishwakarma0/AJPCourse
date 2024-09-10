package aug29;

 class Appliance {
    String brand;
    String powerConsumption;

    void applianceInfo(){
        System.out.println("Brand of appliance is "+ brand);
        System.out.println("Power consumption of appliance is "+ powerConsumption);
    }

}
class  Refrigerator extends Appliance{
    public String capacity;
    private String temp;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
    public void turnOn(){
        System.out.println("Device is on");
    }
}
class  Oven extends Appliance{

    public String maxTemp;
    private String temp;

    public String getTemp() {
        return temp;
    }
    public void setTemp(String temp) {
        this.temp = temp;
    }
}
