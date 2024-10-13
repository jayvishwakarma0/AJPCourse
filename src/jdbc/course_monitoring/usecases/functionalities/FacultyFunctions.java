package jdbc.course_monitoring.usecases.functionalities;

import jdbc.course_monitoring.model.Faculty;
import jdbc.course_monitoring.service.FacultyService;
import jdbc.course_monitoring.service.FacultyServiceImpl;

import java.util.List;
import java.util.Scanner;

public class FacultyFunctions {
    private static Scanner sc = new Scanner(System.in);
    public void facultyFunction(){
        FacultyService facultyService = new FacultyServiceImpl();
        System.out.println("_____Faculty Portal_____");
        System.out.println("1. Create Faculty\n2. Update Faculty\n3. View Faculty\n4. Delete Faculty");
        int opt1 = sc.nextInt();
        switch (opt1){
            case 1:
                System.out.print("Enter Faculty Name: ");
                sc.nextLine();
                String facultyName = sc.nextLine();
                System.out.print("Enter Faculty Address: ");
                String facultyAddress = sc.nextLine();
                System.out.print("Enter Faculty Mobile Number: ");
                int mobileNo = sc.nextInt();
                System.out.print("Enter Faculty Email: ");
                String email = sc.next();
                System.out.print("Enter Faculty Username: ");
                String username = sc.next();
                System.out.print("Enter Faculty Password: ");
                String password = sc.next();
                Faculty faculty = new Faculty(facultyName,facultyAddress,mobileNo,email,username,password);
                System.out.println(facultyService.addFaculty(faculty));
                break;
            case 2:
                System.out.print("Enter Faculty Id: ");
                int facultyId = sc.nextInt();
                System.out.print("Enter updated Faculty Name: ");
                sc.nextLine();
                String updatedName = sc.nextLine();
                System.out.print("Enter updated Faculty Address: ");
                String updatedAddress = sc.nextLine();
                System.out.print("Enter updated Faculty Mobile Number: ");
                int updatedMobileNo = sc.nextInt();
                System.out.print("Enter updated Faculty Email: ");
                String updatedEmail = sc.next();
                System.out.print("Enter updated Faculty Username: ");
                String updatedUsername = sc.next();
                System.out.print("Enter updated Faculty Password: ");
                String updatedPassword = sc.next();
                Faculty updatedFaculty = new Faculty(updatedName,updatedAddress,updatedMobileNo,updatedEmail,updatedUsername,updatedPassword);
                System.out.println(facultyService.updateFaculty(facultyId,updatedFaculty));;
                break;
            case 3:
                System.out.println("1. View Faculty by Faculty Id\n2. View All Faculties");
                int viewFaculty = sc.nextInt();
                if(viewFaculty==1){
                    System.out.print("Enter FacultyId: ");
                    System.out.println(facultyService.getFacultyById(sc.nextInt()));
                } else if(viewFaculty==2){
                    List<Faculty> faculties = facultyService.getAllFaculties();
                    for(Faculty faculty1: faculties){
                        System.out.println(faculty1);
                    }
                } else{
                    System.out.println("Invalid Choice.");
                }
                break;
            case 4:
                System.out.print("Enter Faculty Id you want to delete: ");
                System.out.println(facultyService.deleteFaculty(sc.nextInt()));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
