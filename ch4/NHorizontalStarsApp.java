package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NHorizontalStarsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give number of stars");
        int n = 0;
        n = scanner.nextInt();

        for (int i=1; i <= n; i++) {
            System.out.print("*");
        }

    }
}
