package jdbc.course_monitoring.usecases;

import jdbc.course_monitoring.model.Admin;
import jdbc.course_monitoring.service.*;
import jdbc.course_monitoring.usecases.functionalities.BatchFunctions;
import jdbc.course_monitoring.usecases.functionalities.CourseFunctions;
import jdbc.course_monitoring.usecases.functionalities.CoursePlanFunctions;
import jdbc.course_monitoring.usecases.functionalities.FacultyFunctions;

import java.util.Scanner;

public class AdminMenu {
    private static Scanner sc = new Scanner(System.in);

    public void adminOperation() {
        AdminService adminService = new AdminServiceImpl();
        System.out.println("***** Admin Menu *****");
        System.out.println("1. Admin Register\n2. Admin Login\n0. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Admin Registration");
                System.out.print("Enter Username: ");
                String newUsername = sc.next();
                System.out.print("Enter Password: ");
                String newPassword = sc.next();
                Admin admin = new Admin(newUsername, newPassword);
                System.out.println(adminService.addAdmin(admin));
                break;
            case 2:
                System.out.print("Enter Username: ");
                String username = sc.next();
                System.out.print("Enter PassWord: ");
                String password = sc.next();

                boolean valid = adminService.authenticate(username, password);
                if (valid) {
                    System.out.println("Login successfully");
                    System.out.println();
                    System.out.println("______Admin Options______");
                    System.out.println("1. Create, Update, View, DeleteCourse.\n" +
                            "2. Create, Update, View, Delete Batch. \n" +
                            "3. Create, Update, View, Delete Faculty.\n" +
                            "4. Create, Update, View, Delete  Course Plan.\n" +
                            "5. Allocate Faculty to a batch.\n" +
                            "6. View the day wise update for every batch.\n" +
                            "7. Generate Report for every batch\n" +
                            "8. Update Password");
                    int option = sc.nextInt();
                    BatchService batchService = new BatchServiceImpl();
                    switch (option) {
                        case 1:
                            CourseFunctions cf = new CourseFunctions();
                            cf.courseFunction();
                            break;
                        case 2:
                            BatchFunctions bf = new BatchFunctions();
                            bf.batchFunction();
                            break;
                        case 3:
                            FacultyFunctions ff = new FacultyFunctions();
                            ff.facultyFunction();
                            break;
                        case 4:
                            CoursePlanFunctions cpf = new CoursePlanFunctions();
                            cpf.coursePlanFunction();
                            break;
                        case 5:
                            System.out.println("Allocate Faculty to a batch");
                            System.out.print("Enter Faculty Id; ");
                            int facultyId = sc.nextInt();
                            System.out.print("Enter Batch Id: ");
                            int batchId = sc.nextInt();
                            batchService.allocateFacultyToBatch(facultyId, batchId);
                            break;
                        case 6:
                            CoursePlanService coursePlanService = new CoursePlanServiceImpl();
                            System.out.println("View the day wise update for a batch.");
                            System.out.print("Enter Batch Id: ");
                            int id = sc.nextInt();
                            coursePlanService.viewDayWiseUpdate(id);
                            break;
                        case 7:
                            System.out.println("1. Generate Report for a batch\n2. Generate Report of all batches");
                            int report = sc.nextInt();
                            if (report == 1) {
                                System.out.print("Enter Batch Id: ");
                                System.out.println(batchService.getBatchById(sc.nextInt()));
                            } else if (report == 2) {
                                System.out.println(batchService.getAllBatches());
                            } else {
                                System.out.println("Invalid Choice");
                            }
                            break;
                        case 8:
                            System.out.print("Enter New Password: ");
                            String updatedPassword = sc.next();
                            System.out.println(adminService.updatePassword(username, updatedPassword));
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                } else {
                    System.out.println("Not valid username or password");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid Choice! Please try again...");
        }
    }
}
