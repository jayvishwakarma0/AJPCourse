package jdbc.course_monitoring.exception;

public class AdminException extends RuntimeException{
    public AdminException() {
    }

    public AdminException(String message) {
        super(message);
    }
}
