package jdbc.emp.usecases;

import jdbc.emp.model.Employee;
import jdbc.emp.services.EmployeeServices;
import jdbc.emp.services.EmployeeServicesImpl;

import java.util.Scanner;

public class EmpMain {
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeServices empSer = new EmployeeServicesImpl();


    public static void main(String[] args) {
        while(true){
            System.out.println("1 for registration\n2 for update");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Oh! you want to insert data");
                    Employee emp = new Employee();
                    System.out.print("Enter emp id: ");
                    emp.setEid(sc.nextInt());

                    System.out.print("Enter emp name: ");
                    emp.setName(sc.next());

                    System.out.print("Enter emp salary: ");
                    emp.setSalary(sc.nextDouble());

                    String ans = empSer.registerEmp(emp);
                    System.out.println(ans);
            }
        }
    }
}
