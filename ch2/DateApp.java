package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δέχεται τρεις ακεραίους αριθμούς από το χρήστη και
 * τους εμφανίζει σε μορφή ΗΗ/ΜΜ/ΕΕΕΕ
 *
 * @author paris
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε ημέρα του μήνα");
        int day = scanner.nextInt();

        System.out.println("Εισάγετε μήνα");
        int month = scanner.nextInt();

        System.out.println("Εισάγετε έτος");
        int year = scanner.nextInt();

        year = year%100;

        System.out.printf("Η ημερομηνία είναι %02d / %02d / %d", day, month, year);

    }
}

