class LinkedList {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        int count = 0;
        while (current != null && count != index) {
            previous = current;
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index " + index + " is out of range.");
            return;
        }
        previous.next = current.next;
    }
}
