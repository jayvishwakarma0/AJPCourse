package sept3;

public class Main {
    public void ageCheck(int age) throws AgeException{
        if(age<18){
            throw new AgeException("You are not eligible for vote");
        } else {

            System.out.println("You are eligible for vote");
        }
    }
    public static void main(String[] args) {
        Main m = new Main();

        try{
           m.ageCheck(14);
        }
        catch (AgeException e){
            e.printStackTrace();
        }

    }
}