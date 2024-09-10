package Labs;

import java.util.ArrayList;
import java.util.Collections;

public class Lab5 {
    static class Book {
        // attributes of book
        int bookId;
        String bookName;
        String authorName;
        // Parameterized constructor for Book
        public Book(int bookId, String bookName, String authorName) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.authorName = authorName;
        }
    }
    public static void reverseList(ArrayList<String> list){
        // Reverse the list
        Collections.reverse(list);

        // Print the reversed list
        System.out.println("\nReversed List:");
        for (String s : list) {
            System.out.println(s);
        }
    }
    // Method to calculate the sum of even numbers in the list
    public static void calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add even number to sum
            }
        }
        // Print the sum
        System.out.println("Sum of all even numbers: " + sum);
    }
    public static void main(String[] args) {
        // Question 1
        // Create a list of books
        ArrayList<Book> myBook = new ArrayList<>();
        myBook.add(new Book(1, "Java Programming", "Java Programmer"));
        myBook.add(new Book(2, "Python Programming", "Python Programmer"));
        myBook.add(new Book(3, "C++ Programming", "C++ Programmer"));
        myBook.add(new Book(4, "JavaScript Programming", "JvaScript Programmer"));

        // Display books
        for (Book b : myBook) {
            System.out.println(b.bookId + " " + b.bookName + " " + b.authorName);
        }

        // Question 2
        // Create a List of strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        // Print the original list
        System.out.println("Original List:");
        for (String s : list) {
            System.out.println(s);
        }

        reverseList(list);  // reverse list

        // Question 3
        // calculates the sum of all even numbers present in an ArrayList of integers.
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(9);
        arr.add(12);

        // Print the original list
        System.out.println("Original List: " + arr);

        calculateSumOfEvenNumbers(arr);
    }
}
