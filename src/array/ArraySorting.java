package array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        //Reference no -1
        printarray(numbers);
        initializeArray(numbers);
        printarray(numbers);
        bubblesort(numbers);
        printarray(numbers);


    }

    //Static methods will be called directly by the method name see reference no 1 in main method for example
    public static void printarray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void bubblesort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapArrayValues(i, i + 1, array);
                }
            }

        }

    }

    public static void swapArrayValues(int i, int i1, int[] array) {
        int temp = array[i];
        array[i] = array[i1];
        array[i1] = temp;


    }

    public static void initializeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;

        }
    }

}

