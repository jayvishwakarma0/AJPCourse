package jdbc.emp.usecases;

import java.util.Scanner;

public class MainMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        EmpMain empStuff = new EmpMain();
        CarMain carStuff = new CarMain();

        while (true){
            System.out.println("***** Main Menu *****");
            System.out.println("1 For Employee Stuff\n2 For Car Stuff\n0 For Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    empStuff.employeeOperation();
                    break;
                case 2:
                    carStuff.carOperation();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println();
        }
    }
}
