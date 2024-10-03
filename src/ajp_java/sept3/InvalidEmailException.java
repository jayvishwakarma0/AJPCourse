package ajp_java.sept3;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException() {
    }

    public InvalidEmailException(String message) {
        super(message);
    }
}
