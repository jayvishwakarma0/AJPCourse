package jdbc.course_monitoring.service;

import jdbc.course_monitoring.exception.CourseException;
import jdbc.course_monitoring.model.Course;

import java.util.List;

public interface CourseService {
    String addCourse(Course course) throws CourseException;
    Course getCourseById(int courseId) throws CourseException;
    List<Course> getAllCourses() throws CourseException;
    String updateCourse(int courseId,Course updatedCourse) throws CourseException;
    String deleteCourse(int courseId) throws CourseException;
}
