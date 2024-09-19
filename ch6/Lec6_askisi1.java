package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Βρίσκει τη θέση του μεγίστου ενός πίνακα arr[]
 *
 * @author paris
 */
public class Lec6_askisi1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; //{4, 5, 8, 2, 4, 9, 7, 10, 5, 8, 11, 1};

        for (int i = 0; i <= arr.length-1; i++) {
           System.out.println("Please give array numbers");
            arr[i] = scanner.nextInt();
        }

        int low = 0;
        int high = 0;
        int maxPos = 0;

        do {
            System.out.println("Please insert the down limit of the array to search for the max element");
            low = scanner.nextInt();
        } while ((low < 1) || (low > arr.length-1));

        do {
            System.out.println("Please insert the upper limit of the array to search for the max element");
            high = scanner.nextInt();
        } while ((high < low) || (high > arr.length-1));

        maxPos = getMaxPosition(arr, low, high) + 1;
        System.out.println("The position of the max element is: " + maxPos);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int max = arr[low];
        for (int i = low+1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
