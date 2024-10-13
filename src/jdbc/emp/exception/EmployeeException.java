package jdbc.emp.exception;

public class EmployeeException extends RuntimeException{
    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException() {
    }
}
