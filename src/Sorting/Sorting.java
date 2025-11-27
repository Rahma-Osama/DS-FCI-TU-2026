package Sorting;

public class Sorting {

    static void selectionSort(int[] arr) {

        // outer loop : we need n-1 iterations to make any array sorted
        for (int i = 0; i < arr.length; i++) {
            // suppose the first item is the minimum
            int minIndex = i;
            // inner loop body: code to find min item in unsorted array
            // note : inner loop starts from j = i+1 "first item in the unsorted list"
            for (int j = i + 1; j < arr.length; j++) {
                // if the current item is less than the minimum "اول item اللي فرضنا انه اصغر
                // واحد" -> update minIndex value
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // after this loop stops -> minIndex is the index of the minimum item
            // so , we need to swap between the first unsorted item and that min item
            // swap between arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // end of inner loop body -> sorted array items are increased by one & unsorted
            // decreased by one.
            // let's repeat that by the outer loop --> sorted array items=n & unsorted=0.
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            // intially we didn't swap between any items -> swapped = false.
            swapped = false;
            // هنبدأ بقا نقارن بين كل عنصر و اللي بعده لو ترتيبهم صح هنكمل لو ترتيبهم غلط
            // هنبدلهم
            // remeber j < n-1-i -> after each iteration there's a sorted list of length i
            for (int j = 0; j < n - i - 1; j++) {
                // 20 , 30 -> correct order -> don't swap.
                // 30, 20 -> incorrect order -> swap to 30 , 20.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break -> list is sorted.
            if (swapped == false)
                break;
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are
             * greater than key, to one position ahead
             * of their current position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 100, 20, 30, 40 };
        selectionSort(arr);
        printArray(arr);

        int[] arr2 = { 100, 20, 30, 40 };
        bubbleSort(arr2);
        printArray(arr2);

        int[] arr3 = { 100, 20, 30, 40 };
        insertionSort(arr3);
        printArray(arr3);

    }

}
