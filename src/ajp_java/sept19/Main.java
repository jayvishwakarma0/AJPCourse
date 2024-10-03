package ajp_java.sept19;

public class Main {
    public static void main(String[] args) {
        VaccinationSuccessful user = new VaccinationSuccessful(22, "Indian");

        user.firstDose();

        boolean firstDoseCompleted = true;
        user.secondDose(firstDoseCompleted);

        boolean secondDoseCompleted = true;
        user.boosterDose(secondDoseCompleted);
    }
}
