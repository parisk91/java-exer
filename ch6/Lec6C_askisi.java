package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Δέχεται και ελέγχει
 */
public class Lec6C_askisi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] choice = new int[6];
        boolean passesFilters = false;
        System.out.println("Δώστε 6 ακέραιους αριθμούς μεταξύ 1 και 49");
        for (int i = 0; i <= choice.length - 1; i++) {
            choice[i] = scanner.nextInt();
            if (choice[i] < 1 || choice[i] > 49) {
                System.out.println("Αριθμός εκτός ορίων, επαναλάβετε");
                choice[i] = scanner.nextInt();
            }
        }

        System.out.println("Οι αριθμοί που επιλέξατε δεν περιλαβάνουν πάνω από 3 άρτιους: " + evensFilter(choice));
        System.out.println("Οι αριθμοί που επιλέξατε δεν περιλαβάνουν πάνω από 3 περιττούς: " + oddsFilter(choice));
        System.out.println("Οι αριθμοί που επιλέξατε δεν περιλαβάνουν πάνω από 3 συνεχόμενους: " + consecutiveFilter(choice));
        System.out.println("Τρεις ή παραπάνω από τους αριθμούς που επιλέξατε δεν έχουν κοινό λήγοντα: " + hasSameEnding(choice));
        System.out.println("Τρεις ή παραπάνω από τους αριθμούς που επιλέξατε δεν ανήκουν στην ίδια δεκάδα: " + sameDecade(choice));
    }

    /**
     * Επιστρέφει αν υπάρχουν πάνω από 3 άρτιοι αρθμοί
     *
     * @param choice    ο πίνακας με τους αριθμούς
     * @return          true αν έχει λιγότερους από 3 άρτιους
     */
    public static boolean evensFilter(int[] choice) {
        int evens = 0;
        for (int i = 0; i <= choice.length - 1; i++) {
            if (choice[i] % 2 == 0) {
                evens++;
            }

        }
        return evens < 3;
    }

    /**
     * Επιστρέφει αν υπάρχουν πάνω από 3 περιττοί αρθμοί
     *
     * @param choice    ο πίνακας με τους αριθμούς
     * @return          true αν έχει λιγότερους από 3 περιττούς
     */
    public static boolean oddsFilter(int[] choice) {
        int odds = 0;
        for (int i = 0; i <= choice.length - 1; i++) {
            if (choice[i] % 2 != 0) {
                odds++;
            }

        }
        return odds < 3;
    }

    /**
     * Επιστρέφει αν δεν υπάρχουν πάνω από 3 συνεχόμενοι αρθμοί
     *
     * @param choice    ο πίνακας με τους αριθμούς
     * @return          true αν δεν έχει πάνω από 3 συνεχόμενους
     */
    public static boolean consecutiveFilter(int[] choice) {
        int cons = 0;
        for (int i = 0; i < choice.length - 2; i++) {
            if ((choice[i] == choice [i+1] - 1) &&  (choice[i] == choice [i+2] - 2)) {
                cons++;
            }
        }
        return cons < 1;
    }

    /**
     * Ελέγχει αν οι αριθμοί έχουν πάνω από 3 κοινούς λήγοντες
     *
     * @param choice    ο πίνακας με τους αριθμούς
     * @return          true αν οι αριθμοί έχουν λιγότερους από 3 ίδιους λήγοντες
     */
    public static boolean hasSameEnding(int[] choice) {
        int [] endings = new int [6];
        boolean hasSameEndings = false;
        for (int i = 0; i <= choice.length - 1; i++) {
            endings [i] = choice[i] % 10;
        }

        for (int item : endings) {
            if (item < 3) {
                hasSameEndings = true;
                break;
            }

        }
        return hasSameEndings;
    }

    /**
     * Ελέγχει αν πάνω από τρεις αριθμοί ανήκουν στην ίδια δεκάδα
     * @param choice    ο πίνακας με τους αριθμούς
     * @return          true αν δεν έχει πάνω απο 3 αριθμούς στην ίδια δεκάδα
     */
    public static boolean sameDecade(int[] choice) {
        int [] decades = new int [6];
        boolean inSameDecade = false;
        for (int i = 0; i <= choice.length - 1; i++) {
            decades [i] = choice[i] / 10;
        }

        for (int item : decades) {
            if (item < 3) {
                inSameDecade = false;
                break;
            }

        }
        return inSameDecade;
    }




}
