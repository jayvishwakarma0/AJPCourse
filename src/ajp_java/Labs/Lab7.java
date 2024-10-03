package ajp_java.Labs;

import java.util.LinkedHashSet;

public class Lab7 {
    // creating the Stack class
    static class MyStack {
        private int top = -1; // initializing top of stack
        private int maxSize;  // declaring max size
        private int[] arr;   // declaring an array for storing elements

        // constructor for Stack class
        public MyStack(int size) {
            this.maxSize = size;
            arr = new int[size];
        }

        // method to add data in stack
        public void push(int data) {
            if (top >= maxSize - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = data;
        }

        // method to delete top element from stack
        public int pop() {
            if (top < 0) {
                System.out.println("Empty stack");
                return -1;
            }
            return arr[top--];
        }

        // method to find peek element of stack
        public int peek() {
            if (top < 0) {
                System.out.println("Empty stack");
                return -1;
            }
            return arr[top];
        }

        // method to get size of stack
        public int getSize() {
            return top + 1;
        }

        // method to check stack is empty or not
        public boolean isEmpty() {
            return getSize() == 0;
        }

        // method to display stack elements
        public void display() {
            if (top == -1) {
                System.out.println("Empty stack");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Question 1
        // Write a Java program to append the specified element to the end of a HashSet

        // declaring the LinkedHasSet which maintains the insertion order
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // adding elements in the set
        set.add("Sachin");
        set.add("Dhoni");
        set.add("Rohit");
        set.add("Virat");
        set.add("Hardik");

        // printing the elements of set
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();

        // Question 2
        // Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
        //stack and display it.

        // we can also declare stack using collection framework as
        //       Stack<Integer> st = new Stack<>();

        // declaring the MyStack class which is emplemented using array
        MyStack st = new MyStack(15);

        // adding 10 elements in the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);

        // display the stack after adding 10 elements
        st.display();

        // remove 4 elements from stack
        for (int i = 1; i <= 4; i++) {
            st.pop();
        }

        // displaying elements of stack after removing 4 elements
        st.display();
    }
}
