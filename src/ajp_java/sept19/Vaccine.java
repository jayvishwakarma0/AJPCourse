package ajp_java.sept19;

abstract class Vaccine {
    int age;
    String nationality;

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose completed. Please pay 250 rs.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose completed.");
        } else {
            System.out.println("You haven't taken the first dose.");
        }
    }

    public abstract void boosterDose(boolean secondDoseCompleted);
}

class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose(boolean secondDoseCompleted) {
        if (secondDoseCompleted) {
            System.out.println("Booster dose completed.");
        } else {
            System.out.println("You haven't completed the second dose.");
        }
    }
}