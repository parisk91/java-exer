package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Decrypts a word/ phrase using, for each letter, the previous ASCII character
 *
 * @author Paris
 */

public class Lec7_Askisi2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Please insert a word");

        input = scanner.nextLine();

        System.out.println("Decrypted: "+ decrypt(input));
    }

    /**
     * Returns the decrypted word using ASII
     *
     * @param input     the phrase to be encrypted
     * @return          the decrypted word
     */
    public static String decrypt (String input) {
        String decryptedInput = "";
        for (int i = 0; i <= input.length()-1; i++) {
            decryptedInput += input.substring(i, i+1).replace(input.charAt(i), (char) ((input.charAt(i)) - 1));
        }
        return decryptedInput;
    }
}
