package Labs;

// Custom exception for invalid country
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

// Custom exception for invalid employee name
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

// Custom exception for tax eligibility
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        // Validate employee name
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        // Validate nationality
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        // Calculate tax based on salary
        double taxAmount;
        if (empSal > 100000) {
            taxAmount = empSal * 0.08; // 8% tax
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 0.06; // 6% tax
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 0.05; // 5% tax
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 0.04; // 4% tax
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class Lab4 {
    // Example of ArrayIndexOutOfBoundsException
    public static void ArrayExcepetion() {
        try {
            int[] arr = {10, 20, 30, 40, 50};
            System.out.println(arr[7]);   // try to access index more than length
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();   // handle exception
        }
    }

    // method to print the array element from 1 to 100
    public static void printArrayElements() {
        int[] numbers = new int[100];

        // Populate the array with values from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Fill the array with numbers 1 through 100
        }

        // Print the array elements
        System.out.println("Array elements from 1 to 100:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        // Question 1
        TaxCalculator calculator = new TaxCalculator();

        // Test Case 1
        try {
            double tax = calculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        // Test Case 2
        try {
            double tax = calculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        // Test Case 3
        try {
            double tax = calculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        // Test Case 4
        try {
            double tax = calculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        // Question 2
        ArrayExcepetion();

        // Question 3
        printArrayElements();
    }
}
