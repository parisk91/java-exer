package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NToOneStarsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=0;
        System.out.println("Please give number of stars");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j=1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
