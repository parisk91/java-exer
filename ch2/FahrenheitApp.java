package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δέχεται έναν ακέραιο αριθμό ως θερμοκρασία Fahrenheit
 * από το χρήστη και την μετατρέπει σε θερμοκρασία Celcious.
 * Στη συνέχεια εκτυπώνει το αποτέλεσμα.
 *
 * @author paris
 */
public class FahrenheitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celcious=0;

        System.out.println("Παρακαλώ εισάγεται μία ακέραιη θερμοκρασία σε βαθμούς Fahrenheit");
        int fahrenheit = scanner.nextInt();

        celcious = (5*(fahrenheit - 32))/9;

        System.out.printf("Η θερμοκρασία %d βαθμοί Fahrenheit αντιστοιχούν σε %d βαθμούς Κελσίου", fahrenheit, celcious);

    }
}
