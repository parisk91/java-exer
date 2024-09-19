package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Βρίσκει το 2ο μικρότερο στοιχείο ενός πίνακα
 *
 * @author paris
 */

public class Lec6_askisi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];//{8, 5, 7, 3, 6, 9, 15}

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println("Please insert array numbers");
            arr[i] = scanner.nextInt();
        }

        System.out.println("The second min element is: " + getMin(arr));
    }

    /**
     * Returns the second min value of the array
     *
     * @param arr   the array to find the 2nd min value
     * @return  the second min value of the array
     */
    public static int getMin (int[] arr) {
        int min = arr[0];
        int minPos = 0;

        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }

        swap(arr, minPos, min);

        int min2 = arr[1];
        int minPos2 = 1;
        for (int i = 2; i <= arr.length-1; i++) {
            if (arr[i] < min2 && arr[i]>arr[0]) {
                min2 = arr[i];
                minPos2 = i;
            }
        }
        return min2;
    }

    /**
     * Swaps the min value of the array with the element
     * of the first position of the array
     *
     * @param arr   the array to change the elements
     * @param minPos    the position of the min element
     * @param min   the min element of the array
     */
    public static void swap(int[] arr, int minPos, int min) {
        int temp = arr[0];
        arr[0] = min;
        arr[minPos] = temp;
    }
}
