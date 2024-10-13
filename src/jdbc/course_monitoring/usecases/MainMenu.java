package jdbc.course_monitoring.usecases;

import java.util.Scanner;

public class MainMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AdminMenu admin = new AdminMenu();
        FacultyMenu faculty = new FacultyMenu();

        while (true){
            System.out.println("***** Main Menu *****");
            System.out.println("1 For Admin\n2 For Faculty\n0 For Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> admin.adminOperation();
                case 2 -> faculty.facultyOperation();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid Choice! Please try again...");
            }
            System.out.println();
        }
    }
}
