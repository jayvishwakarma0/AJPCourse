package ajp_java.sept11;

public class StackArrayImplement {
    static class Stack {
        private int top = -1;
        private int maxSize;
        private int[] arr;

        public Stack(int size) {
            this.maxSize = size;
            arr = new int[size];
        }

        // method to add data
        public void push(int data) {
            if (top >= maxSize-1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = data;
        }

        // method to delete data
        public int pop() {
            if (top < 0) {
                System.out.println("Empty stack");
                return -1;
            }
            return arr[top--];
        }

        // find peek
        public int peek() {
            if (top < 0) {
                System.out.println("Empty stack");
                return -1;
            }
            return arr[top];
        }

        // get size
        public int getSize() {
            return top + 1;
        }

        // isEmpty
        public boolean isEmpty() {
            return getSize() == 0;
        }

        // display
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
        Stack st = new Stack(6);

        System.out.println(st.isEmpty());
        System.out.println(st.getSize());
        st.push(1);
        st.push(3);
        System.out.println(st.isEmpty());

        st.display();
        st.push(5);
        st.push(4);
        System.out.println(st.pop());
        st.push(6);
        st.push(2);
        System.out.println(st.getSize());
//        System.out.println(st.peek());

        st.display();
        st.push(11);



    }
}
