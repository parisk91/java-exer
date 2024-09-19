package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει μενού στο χρήστη με 6 επιλογές και εμφανίζει
 * τα αντίστοιχα αστεράκια ανάλογα την επιλογή
 *
 * @author paris
 */
public class StarMethodApp {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int choice = 0;
        int n = 0;

            do {

                printMenu();
                choice = scanner.nextInt();

                if (choice < 1 || choice > 6) {
                    System.out.println("Λάθος επιλογή");
                    continue;
                }

                if (choice == 6) {
                    break;
                }

                System.out.println("Παρακαλώ δώστε αριθμό για αστεράκια");
                n = scanner.nextInt();

                switch (choice) {
                    case 1:
                        starsHorizontal(n);
                        break;
                    case 2:
                        starsVertical(n);
                        break;
                    case 3:
                        nxNStars(n);
                        break;
                    case 4:
                        oneToNStars(n);
                        break;
                    case 5:
                        nToOneStars(n);
                        break;
                }


            } while (choice != 6);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή");
    }

    public static void printMenu () {
        System.out.println("Επέλεξε ένα από τα παρακάτω:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Παρακαλώ επιλέξτε");
    }

    /**
     * Prints n number of stars in horizontal direction
     *
     * @param n number of stars to be printed
     */
    public static void starsHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    /**
     * Prints n number of stars in vertical direction
     *
     * @param n number of stars to be printed
     */
    public static void starsVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * prints n rows with n columns of stars
     *
     * @param n number of rows and columns to be printed
     */
    public static void nxNStars (int n) {
        for (int j = 1; j <= n; j++) {
            starsHorizontal(n);
            System.out.println();
        }
    }

    /**
     * prints 1 to n stars in n rows
     *
     * @param n number of rows and max number of stars to be printed
     */
    public static void oneToNStars (int n) {
        for (int j = 1; j <= n; j++) {
            starsHorizontal(j);
            System.out.println();
        }
    }

    /**
     * prints n to 1 stars in n rows
     *
     * @param n number of rows and max number of stars to be printed
     */
    public static void nToOneStars (int n) {
        for (int j = n; j >= 1; j--) {
            starsHorizontal(j);
            System.out.println();
        }
    }


}