package edu.asu.transcend.diamonds;

public class Diamonds {
    public static void main(String[] args) {
        // TODO: Print Diamond Pattern of "*" of certain line height
        // TODO: Get the "certain line height" from user input in the form of "Arguments" from the command line
        // TODO: How to run with args in NetBeans
        // TODO: Executable Jar
        // TODO: How to run the Jar from command line with args.

        int height = 12;
        int spaces = height / 2;
        int asterisk = 1;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < spaces; j++) {
                // Print a Blank Space
                System.out.print(" ");
            }
            for (int j = 0; j < asterisk; j++) {
                // Print a "*"
                System.out.print("*");
            }
            System.out.print("\n");
            spaces--;
            asterisk += 2;
        }
        // Just to trim up our diamond
        asterisk -= 1;
        for (int i = 0; i <= height / 2; i++) {
            for (int j = 0; j < spaces; j++) {
                // Print a Blank space
                System.out.print(" ");
            }
            for (int j = 0; j <= asterisk; j++) {
                // Print a "*"
                System.out.print("*");
            }
            System.out.print("\n");
            spaces++;
            asterisk -= 2;

        }

    }
}
