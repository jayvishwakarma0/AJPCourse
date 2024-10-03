package ajp_java.aug27.aug27Home;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.teamSize = 5;
        m.employeeId = 11;
        m.age = 34;
        m.department = "Computer Science";
        m.name = "Rocky";

        m.displayPersonalInfo();
        m.employeeSpecificInfo();
        m.managerSpecificInfo();
    }
}
