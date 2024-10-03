package ajp_java.aug23;

 class DeliveryPartner {
    private String ptnrName;
    private int ptnrId;
    private double ptnrSalary;

//    public DeliveryPartner(String ptnrName,int ptnrId, double ptnrSalary) {
//        this.ptnrName = ptnrName;
//        this.ptnrId = ptnrId;
//        this.ptnrSalary = ptnrSalary;
//    }

    public String getPtnrName() {
        return ptnrName;
    }

    public int getPtnrId() {
        return ptnrId;
    }

    public void setPtnrId(int ptnrId) {
        this.ptnrId = ptnrId;
    }

    public double getPtnrSalary() {
        return ptnrSalary;
    }

    public void setPtnrSalary(double ptnrSalary) {
        this.ptnrSalary = ptnrSalary;
    }

    public void setPtnrName(String ptnrName) {
        this.ptnrName = ptnrName;
    }

    public static void main(String[] args) {
        DeliveryPartner dp = new DeliveryPartner();

        dp.setPtnrName("Rohan");
        dp.setPtnrId(12);
        dp.setPtnrSalary(20000);

        System.out.println(dp.getPtnrName());
        System.out.println(dp.getPtnrId());
        System.out.println(dp.getPtnrSalary());
    }
}
