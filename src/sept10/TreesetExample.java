package sept10;

import java.util.TreeSet;

public class TreesetExample {
    static class Employee implements Comparable<Employee>{
        int empId;
        String empName;
        int salary;

        public Employee(int empId,String empName,int salary) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee e2){
            if(this.salary>e2.salary){
                return 1;
            } else if(this.salary< e2.salary){
                return -1;
            } else{
                return this.empName.compareTo(e2.empName);
            }
        }
    }
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>();

        set.add(new Employee(1,"Rohit",7000));
        set.add(new Employee(2,"Dhoni",8000));
        set.add(new Employee(3,"Virat",7500));
        set.add(new Employee(4,"Hardik",6000));
        set.add(new Employee(5,"Sachin",8000));

        for(Employee e: set){
            System.out.println(e.empId+" "+e.empName+" "+e.salary);
        }
    }
}
