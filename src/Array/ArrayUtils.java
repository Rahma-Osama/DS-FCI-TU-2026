package Array;

public class ArrayUtils {
    int[] items;
    int itemsCount;

    ArrayUtils(int size) {
        items = new int[size];
        itemsCount = 0;
    }
  

    // Method to Check if array is full or not
    boolean isFull() {
        // if(itemsCount==items.length){
        // return true;
        // }
        // else {
        // return false;
        // }
        return itemsCount == items.length;
    }

    // Method to access pecific item
    void accessItem(int index) {
        if (index < items.length)
            System.out.println(items[index]);
        else
            System.out.println("Item Not Found");
    }

    // Methd to append otems "Add to last"
    void append(int item) {
        // if(itemsCount==items.length){
        // System.out.println("Insertion Failed , Array is Full");
        // }
        if (isFull()) {
            System.out.println("Insertion Failed , Array is Full");
            return;
        }
        // items[itemsCount]=item;
        // itemsCount++;

        items[itemsCount++] = item;

    }

    // Method to traverse array items
    void traverseItems() {
        // for(int i=0; i<items.length;i++){}
        for (int i = 0; i < itemsCount; i++) {
            System.out.println("Item in index " + i + " is: " + items[i]);
        }
        // another way : use for each loop
        // for(int item : items) {
        // System.out.println("Item is "+item );

        // }
    }

    // Method to search a specific item

    void searchItem(int item) {

        for (int i = 0; i < itemsCount; i++) {
            if (items[i] == item) {
                System.out.println("Item " + item + " is found at index " + i);
                return;
            }
        }
        System.out.println("Item Not Found");
    }

    boolean isItemFound(int item) {
        for (int i : items) {
            if (item == i)
                return true;
        }
        return false;

    }

    // Method to insert item in specific location.
    void insert(int pos, int newItem) {

        // 1-st step : check if there's an empty location(s) to insert item.
        if (isFull()) {
            System.out.println("Failed Insertion, Arrayis Full");
            return;
        }

        // 2nd-step : shift items.
        for (int i = itemsCount; i > pos; i--) {
            items[i] = items[i - 1];
        }

        // 3rd-step : Now It's ready to insert ur item.
        items[pos] = newItem;
        itemsCount++;
    }


    void deleteItemAtspecificIndex(int index) {

        for (int i = index; i < itemsCount - 1; i++) {
            items[i] = items[i + 1];
        }
        itemsCount--;
    }

        // method to delete last item.
    void deleteLastItem() {
        // we'll create new array , insert data to new array from the old one , then
        // make the old array reference the new one
        int[] newArr = new int[itemsCount];

        // copy items except last one
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = items[i];
        }
        items = newArr;
        itemsCount--;
    }
  


    void enlargeArray(int newSize) {
        // Array is static DS.
        // So the size of array is not changeable.
        // so we'll create new array and make the old one reference to it "tricky".

        if (newSize <= items.length) {
            System.out.println("Can't Enlarge array");
            return; 
        }
        
        int[] newArray = new int[newSize];   

        for (int i = 0; i < items.length; i++) {
            newArray[i] = items[i];
        }

        items = newArray;
    }
}

