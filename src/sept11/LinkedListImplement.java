package sept11;

public class LinkedListImplement {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    static class LinkedList {
        static int size = 0;

        // add element
        public void addFirst(int data) {
            if (head == null) {
                Node newNode = new Node(data);
                head = newNode;
                size++;
                return;
            }
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        public void addLast(int data) {
            if (head == null) {
                head = new Node(data);
                size++;
                return;
            }
            Node newNode = new Node(data);
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            size++;
        }

        public void addAt(int idx, int data) {
            if (idx > size || idx < 0) {
                System.out.println("Invalid Index");
                return;
            }
            if (idx == 0) {
                addFirst(data);
                return;
            }
            if (idx == size - 1) {
                addLast(data);
                return;
            }
            Node curr = head;
            for (int i = 0; i < idx - 1; i++) {
                curr = curr.next;
            }
            Node newNode = new Node(data);
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }


        // remove
        public int removeFirst() {
            if (head == null) {
                System.out.println("Empty List");
                return 0;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if (head == null) {
                System.out.println("Empty List");
                return 0;
            }
            if (head.next == null) {
                int val = head.data;
                head = null;
                size--;
                return val;
            }
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            int val = curr.next.data;
            curr.next = null;
            size--;
            return val;
        }

        // remove at index
        public int removeAt(int idx) {
            if (idx >= size || idx < 0) {
                System.out.println("Invalid Index");
                return -1;
            }
            if (idx == 0) {
                return removeFirst();
            }
            if (idx == size - 1) {
                return removeLast();
            }
            Node curr = head;
            for (int i = 0; i < idx - 1; i++) {
                curr = curr.next;
            }
            int val = curr.next.data;
            curr.next = curr.next.next;
            size--;

            return val;
        }

        // get size
        public int getSize() {
            return size;
        }

        // isEmpty()
        public boolean isEmpty() {
            return size == 0;
        }

        // display
        public void display() {
            if (head == null) {
                System.out.println("Empty List");
                return;
            }
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.display();
        System.out.println(ll.isEmpty());
        ll.addFirst(11);
        ll.addFirst(12);
        System.out.println(ll.isEmpty());
        System.out.println(ll.getSize());
        ll.addLast(14);
        ll.addLast(15);

        ll.display();

        System.out.println(ll.removeAt(3));

        ll.addAt(0, 1);
        ll.addAt(1, 10);
        ll.addAt(2, 9);
        ll.addAt(5, 6);

        System.out.println(ll.getSize());

        ll.display();

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());

        ll.display();
    }
}
