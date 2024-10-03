package ajp_java.Labs;

import java.util.Arrays;

// Base class User
class User {
    // Properties of User
    int id;
    String name;

    // Parameterized constructor for User
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display user information
    public void displayUserInfo() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
    }
}

// Subclass Employee inheriting from User
class Employee extends User {
    // Additional property for Employee
    double salary;

    // Parameterized constructor for Employee (inherits User properties)
    public Employee(int id, String name, double salary) {
        super(id, name);   // Call the constructor of the superclass (User)
        this.salary = salary;
    }

    // Method to calculate the annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to display employee information including salary
    public void displayEmployeeInfo() {
        displayUserInfo();  // Call the superclass method to display user info
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

public class Lab2 {
    // method to find second largest
    public static void findSecondHighestInSubarray(int[] arr, int st, int end) {
        int[] subArray = Arrays.copyOfRange(arr, st, end + 1);  // Extract the subarray
        System.out.println("Sub array: " + Arrays.toString(subArray)); // Display the subarray
        Arrays.sort(subArray);      // Sort the subarray in escending order

        // The second highest will be the second-last element in a sorted array
        int secondHighest = subArray[subArray.length - 2];

        // Display the second highest element
        System.out.println("2nd Highest element: " + secondHighest);
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong number
    public static void isStrongNumber(int number) {
        int originalNumber = number, sum = 0;

        // Loop through each digit of the number
        while (number > 0) {
            int digit = number % 10;      // Extract last digit
            sum += factorial(digit);      // Add factorial of the digit to sum
            number /= 10;                 // Remove last digit from number
        }

        // Check if the sum of factorials is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }

    // method to check given year  is leap year or not
    public static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
        int st = 2, end = 6;
        findSecondHighestInSubarray(arr, 2, 6);

        isStrongNumber(145);  // Check for Strong number

        checkLeapYear(2024);   // Check leap year

        // Create an Employee object
        Employee emp = new Employee(101, "Tony Stark", 10000.0);

        // Display employee information and annual salary
        emp.displayEmployeeInfo();
    }
}
