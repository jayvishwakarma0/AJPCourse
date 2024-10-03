package ajp_java.sept3;

public class Test {
    public void checkMail(String mail) throws InvalidEmailException {
        if (!mail.contains("@")) {
            throw new InvalidEmailException("Invalid Email");
        } else {
            System.out.println("Valid Email");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();

        try {
            t.checkMail("jay1234gmail.com");
        } catch (InvalidEmailException e) {
            e.printStackTrace();
        }
    }
}
