package Sorting;

public class FindMinItem {

    public static void main(String[] args) {

        int[] arr = { 20, 30, 40, 10, 80 };
        int minIndex = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }

        }

        System.out.println(minIndex);

    }

}
