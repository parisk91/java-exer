package gr.aueb.cf.ch7;

/**
 * Encrypts a word/ phrase using, for each letter, the next ASCII character
 *
 * @author Paris
 */

import java.util.Scanner;

public class Lec7_askisi1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        String replace;

        System.out.println("Please insert a word");

        input = scanner.nextLine();


        System.out.println("Encrypted: "+ encrypt(input));
    }

    /**
     * Returns the encrypted word using ASII
     *
     * @param input     the phrase to be encrypted
     * @return          the encrypted word
     */
    public static String encrypt (String input) {
        String encryptedInput = "";
        for (int i = 0; i <= input.length()-1; i++) {
            encryptedInput += input.substring(i, i+1).replace(input.charAt(i), (char) ((input.charAt(i)) + 1));
        }
    return encryptedInput;
    }
}
