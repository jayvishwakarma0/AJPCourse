package jdbc.course_monitoring.usecases.functionalities;

import jdbc.course_monitoring.model.CoursePlan;
import jdbc.course_monitoring.service.CoursePlanService;
import jdbc.course_monitoring.service.CoursePlanServiceImpl;

import java.util.Scanner;

public class CoursePlanFunctions {
    private static Scanner sc = new Scanner(System.in);
    public void coursePlanFunction(){
        CoursePlanService coursePlanService = new CoursePlanServiceImpl();
        System.out.println("_____Course Plan Portal_____");
        System.out.println("1. Create Course Plan\n2. Update Course Plan\n3. View Course Plan\n4. Delete Course Plan");
        int opt1 = sc.nextInt();
        switch (opt1){
            case 1:
                System.out.print("Enter Batch Id: ");
                int batchId = sc.nextInt();
                System.out.print("Enter day Number: ");
                int dayNumber = sc.nextInt();
                System.out.print("Enter Topic: ");
                sc.nextLine();
                String topic = sc.nextLine();
                System.out.print("Enter Status(completed/pending): ");
                String status = sc.next();
                CoursePlan coursePlan = new CoursePlan(batchId,dayNumber,topic,status);
                System.out.println(coursePlanService.addCoursePlan(coursePlan));
                break;
            case 2:
                System.out.print("Enter planId: ");
                int planId = sc.nextInt();
                System.out.print("Enter Updated Batch Id: ");
                int updatedBatchId = sc.nextInt();
                System.out.print("Enter Updated day Number: ");
                int updatedUayNumber = sc.nextInt();
                System.out.print("Enter Updated Topic: ");
                sc.nextLine();
                String updatedTopic = sc.nextLine();
                System.out.print("Enter Updated Status(completed/pending): ");
                String updatedStatus = sc.next();
                CoursePlan updatedCoursePlan = new CoursePlan(updatedBatchId,updatedUayNumber,updatedTopic,updatedStatus);
                System.out.println(coursePlanService.updateCoursePlan(planId,updatedCoursePlan));
                break;
            case 3:
                System.out.print("Enter Batch Id: ");
                System.out.println(coursePlanService.getCoursePlanByBatchId(sc.nextInt()));
                break;
            case 4:
                System.out.print("Enter planId of Course Plan you want to delete: ");
                System.out.println(coursePlanService.deleteCoursePlan(sc.nextInt()));
            default:
                System.out.println("Invalid Choice");
        }
    }
}