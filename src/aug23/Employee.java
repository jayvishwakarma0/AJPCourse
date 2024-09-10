package aug23;

public class Employee {
    private String empName;
    private int empId;
    private double salary;

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        if(empId<0){
            System.out.println("Can't set");
        } else{
        this.empId = empId;
        }
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public static void main(String[] args) {
         Employee emp = new Employee();
         emp.setEmpId(23);
         emp.setEmpName("Jay");
         emp.setSalary(30000);

        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getSalary());
    }
}
