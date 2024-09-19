package gr.aueb.cf.ch9;


import gr.aueb.cl.ch3.WhileApp;

/**
 * Reads a .txt with students' names and grades and
 * prints a new .txt with the names and the averages
 *
 * @author Paris
 */

import java.io.*;
import java.nio.charset.StandardCharsets;

public class GradesApp {

    public static void main(String[] args) throws IOException {

        String line;
        String[] students;
        double average;
        String avg;
        File dir = new File("C://Users//paris//OneDrive//Υπολογιστής//Coding Factory//1. Java//8η εβδομάδα//Askisi/");

        if (!dir.exists()) {
            boolean success = dir.mkdir();
            if (!success) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }

        try {
            BufferedReader bf = new BufferedReader(new FileReader("C://Users//paris//OneDrive//Υπολογιστής//Coding Factory//1. Java//8η εβδομάδα//Askisi//InputGrades.txt/"));
            PrintStream grades = new PrintStream(new FileOutputStream(dir + "/" + "avg.txt", true), true, StandardCharsets.UTF_8);

            while ((line = bf.readLine()) != null) {
                students = line.split(" +");
                print(grades, students);
                average = (Integer.parseInt(students[2]) + Integer.parseInt(students[3])) / 2.0;
                avg = String.valueOf(average);
                print(grades, avg);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *Prints the names of the students in the new avg.txt
     *
     * @param gr    the stream to print the names in the new .txt
     * @param students  the string[] to take the students' names
     */
    public static void print (PrintStream gr, String[] students) {
        for (int i = 0; i <= 1; i++) {
            gr.print(students[i] + " ");
        }
    }

    /**
     *Prints each student's average in the new avg.txt
     *
     * @param gr the stream to print the average in the new .txt
     * @param avg the string with each student's average
     */
    public static void print (PrintStream gr, String avg) {
            gr.print(avg + " ");
            gr.println(" ");
    }

}