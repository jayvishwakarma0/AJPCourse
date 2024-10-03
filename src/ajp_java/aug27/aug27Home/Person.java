package ajp_java.aug27.aug27Home;

public class Person {
    String name;
    int age;
    void displayPersonalInfo(){
        System.out.println("Name of person is "+ name);
        System.out.println("Age of person is "+ age);
    }
}
class Employee extends Person{
  int employeeId;
  String department;
  void employeeSpecificInfo(){
      System.out.println("Employee Id is "+employeeId);
      System.out.println("Department is "+department);
  }
}
class Manager extends Employee{
    int teamSize;
    void managerSpecificInfo(){
        System.out.println("The team is "+teamSize);
    }
}
