package edu.asu.transcend.fileinputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

// https://www.mkyong.com/java/java-read-a-text-file-line-by-line/
//
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
                fw.write(getRandomInteger(3, 97) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataAndPrintTraingles() {

    }

    public static int getRandomInteger(int min, int max) {
        Random rando = new Random();
        return rando.ints().limit(1).findFirst().getAsInt();
    }

}
