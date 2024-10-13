package jdbc.course_monitoring.exception;

public class CourseException extends RuntimeException{
    public CourseException() {
    }

    public CourseException(String message) {
        super(message);
    }
}
