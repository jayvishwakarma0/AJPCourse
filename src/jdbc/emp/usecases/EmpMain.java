package jdbc.emp.usecases;

import jdbc.emp.model.Employee;
import jdbc.emp.service.EmployeeService;
import jdbc.emp.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeService empSer = new EmployeeServiceImpl();

    public void employeeOperation() {
        while(true){
            System.out.println("***** Employee Menu *****");
            System.out.println("1 for registration\n2 for update\n3 for delete\n4 for get data by id\n5 for get All Emp\n0 for exit");
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
                    break;
                case 2:
                    System.out.println("Oh you want to update th data");
                    System.out.println("Enter employee id you want to update");
                    Employee updateEmp = empSer.getEmpById(sc.nextInt());
                    System.out.println("Enter updated name of employee");
                    updateEmp.setName(sc.next());
                    System.out.println("Enter updated salary of employee");
                    updateEmp.setSalary(sc.nextDouble());

                    String msg = empSer.updateEmp(updateEmp);
                    System.out.println(msg);
                    break;

                case 3:
                    System.out.println("Oh! you want to delete employee");
                    System.out.println("Enter employee Id");
                    Employee delEmp = empSer.deleteEmp(sc.nextInt());
                    System.out.println(delEmp);
                    break;
                case 4:
                    System.out.println("Oh! you want data by emp id");
                    System.out.println("Enter employee id");
                    Employee employee = empSer.getEmpById(sc.nextInt());
                    System.out.println(employee);
                    break;
                case 5:
                    System.out.println("Oh! you want data of all employees");
                    List<Employee> allEmp = empSer.getAllEmp();
                    System.out.println(allEmp);
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println();
        }
    }
}
