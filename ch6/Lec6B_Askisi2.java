package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Lec6B_Askisi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Παρακαλούμε εισάγεται τον αριθμό των εγγραφών του πίνακα");
        n = scanner.nextInt();
        int [][] arr = new int [n][2];
        int max = 0;
        int count = 0;
        System.out.println("Παρακαλούμε εισάγετε την ώρα άφιξης και αναχώρησης των " + n + " αυτοκινήτων");
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= 1; j++) {
            arr[i][j] = scanner.nextInt();
            }
        }

        int[][] arrNew = orderedArr(arr, n);
        for (int j = 0; j <= arrNew.length-1; j++) {
            if (arrNew[j][1] == 1) {
                count = count + 1;
                if ( count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Ο μέγιστος αριθμός οχημάτων που είναι σταθμευμένα ταυτόχρονα είναι " + max);


    }

    public static int[][] orderedArr(int [][] arr, int n) {
        int [][] orderedArray = new int [2*n][2];
        for (int i = 0; i <= orderedArray.length-1; i=i+2) {
                orderedArray [i][0] = arr [i/2][0];
                orderedArray [i][1] = 1;
        }

        for (int j = 1; j <= orderedArray.length-2; j=j+2) {
            orderedArray [j][0] = arr [j/2][1];
            orderedArray [j][1] = 0;
        }

        for (int i = orderedArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (orderedArray[j][0] > orderedArray [j+1][0]) {
                    int temp = orderedArray [j+1][0];
                    orderedArray [j+1][0] = orderedArray[j][0];
                    orderedArray [j][0] = temp;
                    int temp2 = orderedArray [j+1][1];
                    orderedArray [j+1][1] = orderedArray[j][1];
                    orderedArray [j][1] = temp2;
                }
            }
        }
        return orderedArray;
    }

}
