package edu.asu.transcend.fileinputoutput;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

// https://www.mkyong.com/java/java-read-a-text-file-line-by-line/
// https://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/
//https://www.mkyong.com/java/how-to-write-to-file-in-java-fileoutputstream-example/
//https://www.mkyong.com/java/how-to-read-and-write-java-object-to-a-file/
public class FileInputOutput {

    public static void main(String[] args) {
        //TODO:
        // write data to a file randomly, then print traingles based on that data
        writeRandomNumbersToAFile();
        readDataAndPrintTraingles();
    }

    public static void writeRandomNumbersToAFile() {
        try {
            FileWriter fw = new FileWriter("outputfile.txt");
            for (int i = 0; i < 10; i++) {
                fw.write(getRandomInteger(5, 15) + "\n");

            }
            fw.close();// Important to close a file when you're done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataAndPrintTraingles() {
        // Java has a File Object, so we can open the file pretty easily by using the FileName as a Constructor Argument.
        File myfile = new File("outputfile.txt");
        // We can use Scanner to read lines from the file,
        // but we have to use a FileReader to get the File as a Stream, the same type of input that System.in is
        // This FileReader constructor throws exceptions, so we need to catch them.
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new FileReader(myfile));
            while (fileScanner.hasNextLine()) {
                // NextLine returns String, we'll just parse it to an integer as we read it. If we get an exception, it will be caught.
                int height = Integer.valueOf(fileScanner.nextLine());
                printTriangleOfCertainHeight(height);
            }
            fileScanner.close();
        } catch (FileNotFoundException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    public static int getRandomInteger(int min, int max) {
        Random rando = new Random();
        return rando.ints(min, max).limit(1).findFirst().getAsInt();
    }

    private static void printTriangleOfCertainHeight(int height) {

        //TODO: If we have an odd number, we will draw a triangle a little differently
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
