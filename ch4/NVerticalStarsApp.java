package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NVerticalStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of stars");
        n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("*");
        }
    }
}
