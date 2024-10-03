package ajp_java.sept5.HomeWork;

public class ValidateUser {
    public void validateUsername(String name) throws InvalidUsernameException{
        if(name==null || name.equals("")){
            throw new InvalidUsernameException("Name can't be null or empty");
        } else{
            System.out.println("Valid Username");
        }
    }

    public static void main(String[] args) {
        ValidateUser t = new ValidateUser();

        try{
            t.validateUsername("jay");
        }
        catch (InvalidUsernameException e){
            e.printStackTrace();
        }
    }
}
