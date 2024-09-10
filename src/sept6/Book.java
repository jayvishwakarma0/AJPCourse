package sept6;

import java.util.ArrayList;

public class Book {
    int bookId;
    String bookName;
    String authorName;
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<>();

        arr.add(new Book(1, "Java Programming", "Java Programmer"));
        arr.add(new Book(2, "Python Programming", "Python Programmer"));
        arr.add(new Book(3, "C++ Programming", "C++ Programmer"));
        arr.add(new Book(4, "JavaScript Programming", "JavaScript Programmer"));
        arr.add(new Book(5, "C Programming", "C Programmer"));

        for (Book b : arr) {
            System.out.println(b.bookId + " " + b.bookName + " " + b.authorName);
        }
    }
}
