package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού στο χρήστη μέχρι
 * ο χρήστης να δώσει τον αριθμό 5.
 */
public class MenuAppAskisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            num = scanner.nextInt();
            if (num==1) {
                System.out.println("Επιλέξατε εισαγωγή");
            } else if (num==2) {
                System.out.println("Επιλέξατε διαγραφή");
            } else if (num==3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (num==4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (num==5) {
                System.out.println("Επιλέξατε Έξοδος");
            } else {
                System.out.println("Μη έγκυρη επιλογή");
            }
        } while (num!=5);
    }
}
