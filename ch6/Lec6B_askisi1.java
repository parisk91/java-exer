package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Lec6B_askisi1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key;
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};

        System.out.println("Please give give a number to find its low and high index in the Array");
        key = scanner.nextInt();

        int[] indexArray = getLowAndHighIndexOf(arr, key);

        System.out.println("The low and high index of the given key in the array is: {" + indexArray[0] + " , " + indexArray[1] + "}" );

    }

    public static int [] getLowAndHighIndexOf (int[] arr, int key) {
        int[] indexArray = new int[2];
        int startPosition = -1;
        int endPosition = -1;
        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                startPosition = i;
                break;
            }
        }
        for (int j = startPosition + 1; j <= arr.length - 1; j++) {
            if (arr[j] == key) {
                count = count + 1;
            }
        }
        endPosition = startPosition + count;
        indexArray[0] = startPosition;
        indexArray[1] = endPosition;
        return indexArray;
    }
}
