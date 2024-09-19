package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Lec8_askisi {

    public static void main(String[] args) {
        int choice;

        menu();
        choice = getChoice();
        try  {
            printChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Επιλογή εκτός ορίων μενού");
        }

    }

    /**
     * Prints the menu
     */
    public static void menu () {
        System.out.println("Παρακαλώ επιλέξτε:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }

    /**
     * Reads user's choice
     *
     * @return user's choice (int)
     */
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Εισάγετε ακέραιο μεταξύ 1 - 5");
                scanner.nextLine();
            }
            return choice;
        }
    }

    /**
     *Prints user's choice
     *
     * @param choice user's choice (int)
     * @throws IllegalArgumentException in case of choice>5 or choice < 1
     */
    public static void printChoice (int choice) throws IllegalArgumentException {
                try {
                    if (choice > 0 & choice < 6) {
                    System.out.println("Επιλέξατε :" + choice);}
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    throw e;
                }
    }

}
