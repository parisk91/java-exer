package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Δέχεται ένα έτος (ακέραιο) από το χρήστη
 * και αποφαίνεται αν είναι δίσεκτο ή όχι
 *
 * @author paris
 */
public class DisektoEtosApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a year");

        year = scanner.nextInt();

        if (year%4==0 && year%100!=0) {
            System.out.println("Leap year");
        } else if (year%4==0 && year%400==0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

    }
}
