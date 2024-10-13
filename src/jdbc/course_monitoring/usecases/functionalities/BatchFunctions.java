package jdbc.course_monitoring.usecases.functionalities;

import jdbc.course_monitoring.model.Batch;
import jdbc.course_monitoring.model.Course;
import jdbc.course_monitoring.service.BatchService;
import jdbc.course_monitoring.service.BatchServiceImpl;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BatchFunctions {
    private static Scanner sc = new Scanner(System.in);

    public void batchFunction() {
        BatchService batchService = new BatchServiceImpl();
        System.out.println("_____Batch Portal_____");
        System.out.println("1. Create Batch\n2. Update Batch\n3. View Batch\n4. Delete Batch");
        int opt1 = sc.nextInt();
        switch (opt1) {
            case 1:
                System.out.print("Enter Course Id: ");
                int courseId = sc.nextInt();
                System.out.print("Enter Faculty Id: ");
                int facultyId = sc.nextInt();
                System.out.print("Enter Number of Students: ");
                int numberOfStudents = sc.nextInt();
                System.out.print("Enter Batch start date(YYYY-MM-DD): ");
                String dateInput = sc.next();
                System.out.print("Enter Batch Duration(In days): ");
                int duration = sc.nextInt();
                try {
                    LocalDate localDate = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    Date date = Date.valueOf(localDate);
                    Batch batch = new Batch(courseId, facultyId, numberOfStudents, date, duration);
                    System.out.println(batchService.addBatch(batch));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("Enter BatchId: ");
                int batchId = sc.nextInt();
                System.out.print("Enter updated courseId: ");
                int updatedCourseId = sc.nextInt();
                System.out.print("Enter updated facultyId: ");
                int updatedFacultyId = sc.nextInt();
                System.out.print("Enter updated Number of Students: ");
                int updatedNoOfStudents = sc.nextInt();
                System.out.print("Enter updated batch start date(YYYY-MM-DD): ");
                String updatedBatchStartDate = sc.next();
                System.out.print("Enter updated batch duration(In days): ");
                int updatedDuration = sc.nextInt();
                try {
                    LocalDate localDate = LocalDate.parse(updatedBatchStartDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    Date date = Date.valueOf(localDate);
                    Batch batch = new Batch(updatedCourseId, updatedFacultyId, updatedNoOfStudents, date, updatedDuration);
                    System.out.println(batchService.updateBatch(batchId, batch));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("1. View Batch by batch Id\n2. View All Batches");
                int viewBatch = sc.nextInt();
                if (viewBatch == 1) {
                    System.out.print("Enter Batch Id: ");
                    System.out.println(batchService.getBatchById(sc.nextInt()));
                } else if (viewBatch == 2) {
                    List<Batch> batches = batchService.getAllBatches();
                    for (Batch batch : batches) {
                        System.out.println(batch);
                    }
                } else {
                    System.out.println("Invalid Choice");
                }
                break;
            case 4:
                System.out.print("Enter Batch Id You want to delete: ");
                System.out.println(batchService.deleteBatch(sc.nextInt()));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
