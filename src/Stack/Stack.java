package Stack;

//using array

public class Stack {

    int maxSize;
    int top;
    int[] stackArr;

    Stack(int size) {
        maxSize = size;
        top = -1;
        stackArr = new int[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Full!!");
            return;
        } else {
            top++;
            stackArr[top]=item;
            // stackArr[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Emptyyy!!");
            return -1;
        } else {
            // int poppedValue=stackArr[top];
            // top--;
            int poppedValue = stackArr[top];
            top--;
            // Get the top element and decrement top
            return poppedValue;
        }
    }

     public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Indicating empty stack
        } else {
            return stackArr[top];
        }
    }

     public void printItems() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }

}
