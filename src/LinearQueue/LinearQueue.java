package LinearQueue;

public class LinearQueue {

     int[] arr; // array to store queue elements
     int maxSize; // maximum size of the queue
     int f; // front pointer
     int l; // rear pointer

    // Constructor
    public LinearQueue(int size) {
        maxSize = size;
        arr = new int[maxSize];
        f = -1;
        l = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty(){
        return f == -1;
    }

    // Check if the queue is full
    public boolean isFull(){
        return l == maxSize - 1;
        // for circular queue :
        //  return(f == (l + 1) % maxSize);

    }

    // Enqueue operation
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow - Cannot insert " + item);
            return;
        }
        l++;
        // for circular queue :
        // l=(l+1)%maxSize;
        arr[l] = item;
        if(f==-1){
            f=0;
        }
        // arr[++l] = item;
        System.out.println("Enqueued: " + item);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow - Nothing to dequeue");
            return -1;
        }

        int item = arr[f];

        if (f == l)
            f = l = -1;
        else
            f++;
        // for circular queue :
        //  f=(f+1)%maxSize;

        System.out.println("Dequeued: " + item);
        return item;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty - Nothing to peek");
            return -1;
        }
        return arr[f];
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = f; i <= l; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //for circular queue:
//     public void display() {
//     if (isEmpty()) {
//         System.out.println("Queue is empty");
//         return;
//     }

//     System.out.print("Queue elements: ");
//     int i = f;
//     while (true) {
//         System.out.print(arr[i] + " ");
//         if (i == r)
//             break;
//         i = (i + 1) % maxSize;
//     }
//     System.out.println();
// }


}