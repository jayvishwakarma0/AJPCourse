package Labs;

import java.util.HashMap;

class HillStations {
    // Method to display location
    public void location() {
        System.out.println("Hill Station location.");
    }
    // Method to display what the place is famous for
    public void famousFor() {
        System.out.println("Famous for its natural beauty.");
    }
}

class Manali extends HillStations {
    @Override     // Override location method
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }
    @Override  // Override famousFor method
    public void famousFor() {
        System.out.println("Manali is famous for adventure sports and scenic beauty.");
    }
}

class Mussoorie extends HillStations {
    @Override  // Override location method
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }
    @Override  // Override famousFor method
    public void famousFor() {
        System.out.println("Mussoorie is famous for its colonial charm and views of the Himalayas.");
    }
}

class Gulmarg extends HillStations {
    @Override  // Override location method
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }
    @Override    // Override famousFor method
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing and its beautiful meadows.");
    }
}

class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override    // Override the makeSound method for Dog
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    @Override   // Override the makeSound method for Cat
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

abstract class Vaccine {
    // Variables to hold user details
    int age;
    String nationality;
    // Constructor to initialize variables
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for the first dose
    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose completed. Please pay 250 rs.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for the second dose
    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose completed.");
        } else {
            System.out.println("You are not eligible for the second dose as you haven't taken the first dose.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose(boolean secondDoseCompleted);
}

class VaccinationSuccessful extends Vaccine {

    // Constructor to initialize age and nationality
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implement the abstract method boosterDose
    @Override
    public void boosterDose(boolean secondDoseCompleted) {
        if (secondDoseCompleted) {
            System.out.println("Booster dose completed.");
        } else {
            System.out.println("You are not eligible for the booster dose as you haven't completed the second dose.");
        }
    }
}

public class Lab3 {
    // Method to check palindrome string
    public static void checkPalindrome(String s) {
        boolean isPalindrome = true;
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
            }
            i++;
            j--;
        }

        if(isPalindrome){
            System.out.println("String is palindrome");
        } else{
            System.out.println("String is not palindrome");
        }
    }

    // Find unique character of string
    public static void findUnique(String s){
        s = s.toLowerCase();
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(!map.containsKey(ch)){
               map.put(ch,1);
           } else {
               map.put(ch,map.get(ch)+1);
           }
       }
       String newString  = "";
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(map.get(ch)==1){
               newString += ch;
           }
       }
        System.out.println("New String of unique character: "+newString);
    }
    public static void main(String[] args) {
        // Question 1 - Check palindrome string
        checkPalindrome("madam");

        // Question 2 -  find unique character in string
        findUnique("java");

        // Question 3
        HillStations hillStation;      // HillStations reference to subclass objects

        hillStation = new Manali();     // Referring to Manali subclass
        hillStation.location();         // Manali's location method
        hillStation.famousFor();        // Manali's famousFor method

        hillStation = new Mussoorie();  // Referring to Mussoorie subclass
        hillStation.location();         // Mussoorie's location method
        hillStation.famousFor();        // Mussoorie's famousFor method

        hillStation = new Gulmarg();    // Referring to Gulmarg subclass
        hillStation.location();         // Gulmarg's location method
        hillStation.famousFor();        // Gulmarg's famousFor method

        // Question 4
        Animal animal = new Animal();    // Assign Animal object to Animal reference
        Animal dog = new Dog();          // Assign Dog object to Animal reference
        Animal cat = new Cat();          // Assign Cat object to Animal reference

        animal.makeSound();   // calling makesound mathod of Animal class
        dog.makeSound();      // calling makesound mathod of Dog class
        cat.makeSound();      // calling makesound mathod of Cat class

        // Question 5
        // Create a VaccinationSuccessful object with user details (age, nationality)
        VaccinationSuccessful user = new VaccinationSuccessful(22, "Indian");

        // Scenario 1: First dose eligibility
        System.out.println("Checking first dose eligibility:");
        user.firstDose(); // Check if the user is eligible for the first dose

        // Assuming the first dose was completed successfully
        boolean firstDoseCompleted = true;

        // Scenario 2: Second dose eligibility
        System.out.println("\nChecking second dose eligibility:");
        user.secondDose(firstDoseCompleted); // Check if the user is eligible for the second dose

        // Assuming the second dose was completed successfully
        boolean secondDoseCompleted = true;

        // Scenario 3: Booster dose eligibility
        System.out.println("\nChecking booster dose eligibility:");
        user.boosterDose(secondDoseCompleted); // Check if the user is eligible for the booster dose
    }
}
