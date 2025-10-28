package LinkedList;

// Create Node class
// كل مره هحتاج اعمل فيها node هاخد object من هنا
class Node {

    int item;
    Node next;

}

public class SingleLinkedList {

    Node head;
    Node tail;
    int length;

    // Initialize empty linked list
    SingleLinkedList() {
        head = tail = null;
        length = 0;
    }

    // Function to check if the linked list is empty or not
    boolean isEmpty() {
        return (length == 0);
    }

    public void insertAtFirst(int item) {
        // Create node
        Node newNode = new Node();
        // Add data to the node
        newNode.item = item;
        // Special case
        // If the linked list is empty -> the node is the first and last one
        // So make the head and tail refer to it
        // The next points to null
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = null;
        }
        // General case
        else {
            newNode.next = head;
            head = newNode;
        }
        // Don't forget to update length every time you insert or delete
        length++;
    }

    public void insertAtLast(int item) {
        // Create node
        Node newNode = new Node();
        newNode.item = item;

        // Special case
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = null;
        }
        // General case
        else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }

        length++;
    }

    public void traverseItems() {
        // Remember not to use head directly
        Node current = head;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
    }

    public void insertAtPosition(int pos, int item) {
        Node newNode = new Node();
        newNode.item = item;

        if (pos == 0)
            insertAtFirst(item);
        else if (pos == length)
            insertAtLast(item);
        else if (pos < 0 || pos > length)
            System.out.println("Out of range");

        // General case
        else {
            Node current = head;
            // Make current refer to the node before the selected position
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }

    public void delete(int item) {
        // Case 1: Empty list
        if (head == null)
            return;

        // Case 2: Item is at the head
        if (head.item == item) {
            head = head.next;

            // If the list becomes empty after deletion, don't forget to update the tail
            if (head == null)
                tail = null;

            length--;
            return;
        }

        // Case 3: Traverse the list to find the target node
        Node current = head;

        // Move until the item is found or reach the end
        while (current.next != null && current.next.item != item) {
            current = current.next;
        }

        // If the item was not found
        if (current.next == null)
            return;

        // If the deleted node is the last node (tail)
        if (current.next == tail) {
            tail = current;
        }

        // Perform the actual deletion
        current.next = current.next.next;

        length--;
    }

}
