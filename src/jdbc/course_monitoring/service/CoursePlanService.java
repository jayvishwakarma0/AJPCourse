package jdbc.course_monitoring.service;


import jdbc.course_monitoring.exception.CourseException;
import jdbc.course_monitoring.exception.CoursePlanException;
import jdbc.course_monitoring.model.CoursePlan;

import java.util.List;

public interface CoursePlanService {

    String addCoursePlan(CoursePlan coursePlan) throws CoursePlanException;
    List<CoursePlan> getCoursePlanByBatchId(int batchId) throws CoursePlanException;
    boolean viewDayWiseUpdate(int batchId) throws CoursePlanException;

    String updateCoursePlan(int planId,CoursePlan updatedCoursePlan) throws CourseException;

    String deleteCoursePlan(int planId) throws CourseException;
}
